package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;

@Controller
public class ContactController {

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
	public String handleForm(@ModelAttribute User user) {
		
		System.out.println(user);
		
		return"success";
	}
}
