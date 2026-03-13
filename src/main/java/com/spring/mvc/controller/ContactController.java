package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Heading", "Details Form");
		m.addAttribute("Desc", "Fill Correct");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user , Model model) {
		System.out.println(user);
		int createdUser = this.userService.creareUser(user);
		model.addAttribute("msg", "User Created with id "+createdUser);
		return"success";
	}
}
