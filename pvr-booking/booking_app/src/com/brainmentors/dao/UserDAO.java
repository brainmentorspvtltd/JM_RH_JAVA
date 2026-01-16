package com.brainmentors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.brainmentors.dto.UserDTO;

public class UserDAO {
    public String auth(UserDTO userDTO) throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select userid from users where userid=? and password=?";

            con = DB.createConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, userDTO.getUserid());
            pstmt.setString(2, userDTO.getPassword());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                return "Welcome " + userDTO.getUserid();
            } else {
                return "Invalid Userid or Password";
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

    }
}
