package com.brainmentors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeatDAO {
    public boolean isBooked(String seatNo, String movieName) throws SQLException, ClassNotFoundException {
        String sql = "select status from seats where seatNo=? and movie=?";
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            System.out.println("Seat No " + seatNo + " Movie Name " + movieName);
            con = DB.createConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, seatNo);
            pstmt.setString(2, movieName);
            System.out.println("Seat No " + seatNo + " movie name " + movieName);
            rs = pstmt.executeQuery();
            if (rs.next()) {

                String status = rs.getString("status");
                System.out.println("Status of Seat is " + status);
                if (status.equals("BOOKED")) {

                    return true; // exit from the function
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }

        }
        return false;
    }

    public boolean seatBooked(String seatNo, String movieName) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DB.createConnection();
            String sql = "update seats set status='BOOKED' where seatNo = ? and movie=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, seatNo);
            pstmt.setString(2, movieName);
            int row = pstmt.executeUpdate();
            if (row > 0) {
                return true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return false;
    }
}
