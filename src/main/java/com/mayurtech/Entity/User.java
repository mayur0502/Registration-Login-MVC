package com.mayurtech.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class User {
	@Id
	private String email;
	private String firstName;
	private String lastName;
	private String Password;
	private String mobileNumber;
	private String Gender;

	public User() {
		super();
	}

	
	public User(String email, String firstName, String lastName, String password, String mobileNumber,
			String gender) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		Password = password;
		this.mobileNumber = mobileNumber;
		Gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	@Override
	public String toString() {
		return "Registration [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", Password="
				+ Password + ", mobileNumber=" + mobileNumber + ", Gender=" + Gender + "]";
	}	
}