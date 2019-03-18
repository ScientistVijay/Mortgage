package com.hcl.mortgage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgage.model.Registration;
import com.hcl.mortgage.service.RegistrationService;
@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegistrationController {

	String message="";
	@Autowired
	RegistrationService registrationService;
	@PostMapping("/save")
	public String register(@RequestBody Registration user) {
		 Optional<Registration> userName=registrationService.findUser(user.getUserName());
		 if(!userName.isPresent()) {
			 registrationService.saveUser(user);
		message = "Registered successfully !!";
		 }else {
			 message = "User Already Registered !!";
		 }
		
		return message;
	}
}
