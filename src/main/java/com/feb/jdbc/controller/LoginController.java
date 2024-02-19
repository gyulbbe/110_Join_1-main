package com.feb.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("1111111111111111");
	}
	
	@GetMapping("/loginPage.do")
	public String loginform() {
		System.out.println("22222222222222222");
		return "login";
	}
	
}
