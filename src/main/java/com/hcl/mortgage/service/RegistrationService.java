package com.hcl.mortgage.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hcl.mortgage.model.Registration;

@Service
public interface RegistrationService {

	public void saveUser( Registration user);
	public Optional<Registration> findUser(String user);
}
