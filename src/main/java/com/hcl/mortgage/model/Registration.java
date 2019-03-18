package com.hcl.mortgage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration")
public class Registration {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="user_name")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="email")
	String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
