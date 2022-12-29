package com.example.registration.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.registration.repository.DAO;


@Component
public class StudentUser implements User {
	@Autowired
	DAO<StudentUser> studentDAO;
	String userName;
	String location;
	Integer userId;
	
//	public StudetUser() {
//		this.userId = (int) (Math.random()*100);
//	}
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public Boolean saveUserDetails() {
		System.out.println(userName);
		if(userName!=null && location!=null) {
//			studentDAO.get(0);
			System.out.println("new user added"+this.userName+this.location+this.userId);
			return true;
		}
		else
			return false;
	}

}
