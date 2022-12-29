package com.example.registration.domain;

import org.springframework.stereotype.Component;

@Component
public class StudetUser implements User {
	String userName;
	String location;
	Integer userId;
	
	public StudetUser() {
		this.userId = (int) (Math.random()*100);
	}
	
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
		if(userName!=null && location!=null && userId!=null ) {
			System.out.println("new user added"+this.userName+this.location+this.userId);
			return true;
		}
		else
			return false;
	}

}
