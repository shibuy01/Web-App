package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		return"contact";
	}
}
