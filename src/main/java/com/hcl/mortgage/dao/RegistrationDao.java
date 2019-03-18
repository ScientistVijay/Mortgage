package com.hcl.mortgage.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.mortgage.model.Registration;

public interface RegistrationDao extends JpaRepository<Registration, Integer>{

	@Query("SELECT r.userName from Registration r where r.userName=?1")
	public Optional<Registration> findUser(String user);
}
