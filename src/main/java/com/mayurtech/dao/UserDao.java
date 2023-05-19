package com.mayurtech.dao;

import com.mayurtech.Entity.User;

public interface UserDao {

	String addFeedBack(User mTechFeebBack);

	User userLogin(String email, String password);
}
