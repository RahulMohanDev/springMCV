package com.example.registration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.registration.domain.StudentUser;
import com.example.registration.domain.User;
import com.example.registration.service.RegistrationService;

@Controller
public class SignupController {
	
	@Autowired
	RegistrationService registrationService;
	
	
	@RequestMapping(value = "/signup",method =RequestMethod.GET )
	public String getSignupPage(Model registrationFormModle) {
		User user = registrationService.getNewStudentUser();
		registrationFormModle.addAttribute("user", user);		
		return "signup";
	}

	@RequestMapping(value="/registerUser")
	public String getResposePage(@ModelAttribute("user") StudentUser studentUser) {
		System.out.println(studentUser.getGender());
	    if(registrationService.registerUser(studentUser.getUserName(),studentUser.getLocation(),studentUser.getGender())) {
	    	return "success";
	    }else {
	    	return "signup";
	    } 
	}

}
