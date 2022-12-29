package com.example.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.domain.User;

@Service
public class UserRegistrationService implements RegistrationService {
	
	@Autowired
	User StudnetUser;

	@Override
	public Boolean registerUser(User user) {
		return StudnetUser.saveUserDetails();
	}

	@Override
	public User getNewStudentUser() {
		return StudnetUser;
	}

}
