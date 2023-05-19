package com.mayurtech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mayurtech.Entity.User;
import com.mayurtech.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userService;

	@PostMapping("userRegistration")
	public ModelAndView UserRegistration(User  registration,HttpServletRequest request) throws Exception{
		
	
		userService.UserRegistration(registration);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Registration");
		return modelAndView;
		
	
	

}
	@PostMapping("userLogin")
	public ModelAndView userLogin(@RequestParam String Email,@RequestParam String Password,HttpServletRequest request) throws Exception{
		

		String msg= userService.userLogin(Email,Password);
		System.out.println(msg);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Login");
//		modelAndView.set\\\
		return modelAndView;
		
	
	

}
	}
