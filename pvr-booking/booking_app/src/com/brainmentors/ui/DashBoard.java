package com.brainmentors.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DashBoard extends JFrame {
    public DashBoard() {
        setTitle("Book Your Show - Enjoy It ");
        setSize(900, 700);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(new GridLayout(1, 3, 10, 10));
        getContentPane().add(addCard("images/dp.jpg", "Dhurender"));
        getContentPane().add(addCard("images/kgf.jpeg", "KGF"));
        getContentPane().add(addCard("images/pushpa.jpg", "Pushpa"));
        // windows c:\\images\\dp.jpg
        setVisible(true);

    }

    JPanel addCard(String imageName, String movieName) {
        JPanel panel = new JPanel();
        ImageIcon icon = new ImageIcon(imageName);
        Image scaledImg = icon.getImage().getScaledInstance(300, 420, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(scaledImg));
        panel.add(label, BorderLayout.NORTH);
        JButton button = new JButton("Book Now");
        button.addActionListener(e -> {
            bookMyShow(movieName);

        });
        panel.add(button, BorderLayout.SOUTH);
        return panel;
    }

    void bookMyShow(String movieName) {
        SeatScreen seatScreen = new SeatScreen(movieName);
    }

    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard();
    }
}
