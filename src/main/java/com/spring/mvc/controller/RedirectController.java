package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	
	@RequestMapping("/one")
	public String one() {
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		return"contact";
	}
}
