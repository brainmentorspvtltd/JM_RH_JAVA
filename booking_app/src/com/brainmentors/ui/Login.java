package com.brainmentors.ui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
    JTextField userid;
    JPasswordField password;

    public Login() {
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel userLbl = new JLabel("Userid");
        userLbl.setFont(new Font("times", Font.BOLD, 30));
        userLbl.setBounds(50, 50, 120, 50);
        this.getContentPane().add(userLbl);
        userid = new JTextField();
        userid.setBounds(150, 50, 150, 50);
        this.getContentPane().add(userid);
        JLabel passwordLbl = new JLabel("Password");
        passwordLbl.setBounds(50, 150, 70, 50);
        this.getContentPane().add(passwordLbl);
        password = new JPasswordField();
        password.setBounds(150, 150, 150, 50);
        this.getContentPane().add(password);
        JButton loginBt = new JButton("Login");
        loginBt.setBounds(100, 250, 70, 50);
        this.getContentPane().add(loginBt);
        loginBt.addActionListener(e -> {
            doLogin();
        });

    }

    void doLogin() {
        String uid = userid.getText();
        char[] pwd = password.getPassword();
        // String pw =new String(pwd);
        // System.out.println(pw);
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}
