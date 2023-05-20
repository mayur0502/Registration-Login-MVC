package com.test.dao;

import com.test.Entity.User;

public interface UserDao {

	String userRegistration(User mTechFeebBack);

	User userLogin(String email, String password);
}
