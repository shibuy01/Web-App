package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;

@Controller
public class ContactController {

	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform" , method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("name") String userName ,
			@RequestParam("password" ) String password, Model model
			) {
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(password);
		
		System.out.println(user);
		
//		System.out.println("userEmail "+ userEmail);
//		System.out.println("Name "+ userName);
//		System.out.println("password " + password);
//		
//		model.addAttribute("email", userEmail);
//		model.addAttribute("name", userName);
//		model.addAttribute("password", password);
		
		model.addAttribute("user",user);
		
		return"success";
	}
}
