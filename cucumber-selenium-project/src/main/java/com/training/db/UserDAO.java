package com.training.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.beans.User;

public class UserDAO {

	GetConnection gc = new GetConnection(); 
	Connection con = GetConnection.getMySQLConnection();
	
	public User getUserDetails(){
		String sql ="select * from user_registration where signed_up is NULL LIMIT 1"; 
		
		
		List<User> users = new ArrayList<User>(); 
		User user = new User();
		try {
			
			gc.ps1 = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.rs = gc.ps1.executeQuery(); 
			
			while(gc.rs.next()) {
				
				user.setUserName(gc.rs.getString("username")); 
				user.setPassword(gc.rs.getString("password")); 
				user.setFirstname(gc.rs.getString("firstname")); 
				user.setLastname(gc.rs.getString("lastname")); 
				user.setEmail(gc.rs.getString("email")); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user; 
	}
	
	public void updateUserSignup(String uname) {
		String sql = "update user_registration set signed_up='YES' where username = '" + uname + "'" ;
		System.out.println(sql);
		try {
			gc.ps2 = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.ps2.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
