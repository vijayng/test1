package com.vijay.myWebApp1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.myWebApp1.Entity.User;
import com.vijay.myWebApp1.dao.UserDao;

@Service
public class LoginService {

	@Autowired
	UserDao userdao;
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	  public LoginService(String userName, String password) { this.userName =
	  userName; this.password = password; }
	 
	 public LoginService() {
		// TODO Auto-generated constructor stub
	}
	
	 
	@Override
	public String toString() {
		return "LoginService [userName=" + userName + ", password=" + password + "]";
	}
	
public boolean loginValidation(String username,String password) {
	User localUser=userdao.FindById(username);
	
	boolean result=false;
	if(username.equals(localUser.getUsername())) 
	    {
		if(password.equals(localUser.getPassword())) {
			result=true;
		}
	    }
		else {
			System.out.println("user name not registerd ");
			result=false;
		}
	return result;
}





}

