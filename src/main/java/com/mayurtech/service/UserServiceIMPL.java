package com.mayurtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayurtech.Entity.User;
import com.mayurtech.dao.UserDao;

@Service
public class UserServiceIMPL implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public String UserRegistration(User registration) {
		// TODO Auto-generated method stub
		String result = userDao.addFeedBack(registration);
		
		return result;
	}

	@Override
	public String userLogin(String email, String password) {
		// TODO Auto-generated method stub
		String msg="";
		User userLogin = userDao.userLogin(email,password);
		if(userLogin.getEmail().equals(email)) {
			if(userLogin.getPassword().equals(password)) {
				msg="Login succesful";
			}else {
				msg = "invalid Password";
			}
		}else {
		msg="Invalid username";
		}
		return msg;
	}
}
