package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	
	@RequestMapping
	public String greeting() {
		
		return "index";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		
		return "welcome";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "about";
	}
}
