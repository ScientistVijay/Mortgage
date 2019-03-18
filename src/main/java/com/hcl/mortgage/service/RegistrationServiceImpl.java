package com.hcl.mortgage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.dao.RegistrationDao;
import com.hcl.mortgage.model.Registration;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDao registrationDao;
	@Override
	public void saveUser(Registration userRegis) {
		// TODO Auto-generated method stub
		registrationDao.save(userRegis);
	}
	@Override
	public Optional<Registration> findUser(String user) {
		// TODO Auto-generated method stub
		return registrationDao.findUser(user);
	}

}
