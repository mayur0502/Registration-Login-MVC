package com.mayurtech.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mayurtech.Entity.User;

@Repository
public class UserDaoIMPL implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String addFeedBack(User registration) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(registration);
		session.beginTransaction().commit();
		return "User Added";
	}

	@Override
	public User userLogin(String email, String password) {
		User user = null;
		Session session= null;
		try {
			session = sessionFactory.openSession();
			user = session.get(User.class, email);
			System.out.println(user);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return user;	
	}

}
