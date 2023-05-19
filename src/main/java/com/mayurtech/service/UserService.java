package com.mayurtech.service;

import com.mayurtech.Entity.User;

public interface UserService {

	String UserRegistration(User mTechFeebBack);



	String userLogin(String email, String password);
}
