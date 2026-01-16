package com.brainmentors.ui;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.brainmentors.dao.SeatDAO;

public class SeatScreen extends JFrame {
    private String movieName; // Instance Variable

    public SeatScreen(String movieName) {
        this.movieName = movieName;
        setSize(900, 800);
        setLocationRelativeTo(null);
        setTitle("Select Seat for " + movieName);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(new GridLayout(5, 6, 5, 5));
        audiLayout();
        setVisible(true);
    }

    private void audiLayout() {
        char seatRow = 'A';
        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <= 6; col++) {

                getContentPane().add(prepareSeat(seatRow + "" + col, movieName));
            }
            seatRow++;
        }
    }

    SeatDAO seatDAO = new SeatDAO();

    private JButton prepareSeat(String seatNo, String movieName) {
        JButton button = new JButton(seatNo);
        try {
            boolean result = seatDAO.isBooked(seatNo, movieName);
            System.out.println("********** BOOLEAN IS " + result);
            if (result) {
                System.out.println("Inside Disable....");
                button.setEnabled(false);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        button.addActionListener(e -> {
            bookMySeat(seatNo, movieName);
            button.setEnabled(false);
        });
        return button;

    }

    private void bookMySeat(String seatNo, String movieName) {
        SeatDAO seatDAO = new SeatDAO();
        boolean r = false;
        try {
            r = seatDAO.seatBooked(seatNo, movieName);
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (r) {
            JOptionPane.showMessageDialog(this, "Ticked Booked");
        } else {
            JOptionPane.showMessageDialog(this, "Problem in Ticked Booked");
        }
    }
}
