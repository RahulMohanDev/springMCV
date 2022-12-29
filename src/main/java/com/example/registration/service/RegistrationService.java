package com.example.registration.service;

import com.example.registration.domain.User;

public interface RegistrationService {
	public Boolean registerUser(User User);
	public User getNewStudentUser();
}
