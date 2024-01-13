package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RecommendationDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/arnav";
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

    public List<BookRecommendation> getRecommendations(int year, String type) {
        System.out.println(type);
        System.out.println(year);         
        List<BookRecommendation> recommendations = new ArrayList<>();
        

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM `1` WHERE year = ? ";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, year);
               

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String title = resultSet.getString("title");
                        String author = resultSet.getString("author");

                        recommendations.add(new BookRecommendation(title, author));
                    }
                }
              
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in a real-world application
        }
        System.out.print(recommendations+ "hello");
        return recommendations;
        
    }
}
