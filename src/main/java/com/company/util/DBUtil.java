package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
private static final String URL ="jdbc:mysql://localhost:3306/project";
private static final String USERNAME = "root";
private static final String PASSWORD = "arnaV@123";
static {
    try {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.print("kaam ho raha haiiii");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}

public static Connection getConnection() throws SQLException {
	System.out.println("connection build ho raha hai");
    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
}
}
