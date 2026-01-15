package com.brainmentors.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public Connection createConnection() throws ClassNotFoundException, SQLException {
        // Step - 1 Load a Driver Class
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingdb", "root",
                "amit123456");
        if (connection != null) {
            System.out.println("Connection Created..");
        }
        return connection;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DB db = new DB();
        db.createConnection();
    }
}
