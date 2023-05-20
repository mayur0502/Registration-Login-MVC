package com.mayurtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class NavigationController {

	@GetMapping("/")
	public String home() {
		return "Login";
	}
	

	@GetMapping("/Registration")
	public String registation(HttpServletRequest request) {
		
		return "Registration";
	}

	@GetMapping("/Login")
	public String login(HttpServletRequest request) {
		
		return "Login";
	}		
	}
