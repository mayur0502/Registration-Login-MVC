package com.test.service;

import com.test.Entity.User;

public interface UserService {

	String UserRegistration(User mTechFeebBack);



	String userLogin(String email, String password);
}
