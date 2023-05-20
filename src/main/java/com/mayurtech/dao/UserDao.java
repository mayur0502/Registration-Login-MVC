package com.mayurtech.dao;

import com.mayurtech.Entity.User;

public interface UserDao {

	String userRegistration(User mTechFeebBack);

	User userLogin(String email, String password);
}
