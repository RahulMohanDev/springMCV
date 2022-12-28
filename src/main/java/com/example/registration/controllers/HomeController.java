package com.example.registration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class HomeController {
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String getHomePage() {
		return "home is so cool";
	}
	

}
