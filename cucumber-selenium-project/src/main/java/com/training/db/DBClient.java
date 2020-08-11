package com.training.db;

import java.sql.SQLException;
import java.util.List;

import com.training.beans.User;

public class DBClient {
	UserDAO userDao = new UserDAO(); 
	User user = userDao.getUserDetails(); 
	public String username = user.getUserName();
	public String password = user.getPassword();
	public String firstname = user.getFirstname();
	public String lastname = user.getLastname();
	public String email = user.getEmail();
	
	public void updateUserSignup(String uname) {
		userDao.updateUserSignup(uname);
	}
	
	public void closecon() throws SQLException {
		GetConnection.closeCon();
	}
	
	public static void main(String[] args) {
		
	/*	for(User temp : user) {
			System.out.println(temp);
			System.out.println(temp.getUserName());
			
		} */
	}
}
