package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

import com.company.util.DBUtil;

public class UserDaoImp1 implements UserDao{
	

	@Override
	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM userses"
				+ ""
				+ " WHERE username = ? AND password = ?";
   	 try (Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

           preparedStatement.setString(1, username);
           preparedStatement.setString(2, password);

           ResultSet resultSet = preparedStatement.executeQuery();

           return resultSet.next();
       } catch (SQLException e) {
           e.printStackTrace();
           return false;
		
	}
   	 }

	@Override
	public boolean addUser(com.company.dao.User user) {
		// TODO Auto-generated method stub
		        String query = "INSERT INTO userses (username, email, password) VALUES (?, ?, ?)";
                System.out.println("user ho liya");
                
		        try (Connection connection = DBUtil.getConnection();
		             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

		            preparedStatement.setString(1, user.getUsername());
		            preparedStatement.setString(2, user.getEmails());
		            preparedStatement.setString(3, user.getPassword());
                    System.out.println("user ho liiya");
		            int rowsAffected = preparedStatement.executeUpdate();

		            return rowsAffected > 0;
		        } catch (SQLException e) {
		            e.printStackTrace();
		            return false;
		        }
		    }

	

	
}
