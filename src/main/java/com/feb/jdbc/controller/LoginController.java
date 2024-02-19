package com.feb.jdbc.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feb.jdbc.service.LoginService;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("1111111111111111");
	}
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/loginPage.do")
	public String goLoginform() {
		System.out.println("22222222222222222");
		return "login";
	}

	@PostMapping("/login.do")
	public ModelAndView login(@RequestParam HashMap<String, String> params) {
		ModelAndView mv = new ModelAndView();
		boolean isLoggedIn = loginService.login(params);
		if(isLoggedIn) {
			mv.addObject("Msg", "성공");
		}
		else {
			mv.addObject("Msg", "실패");
		}
		mv.setViewName("login");
		return mv;
	}

	@PostMapping("/join.do")
	public ModelAndView join(@RequestParam HashMap<String, String> params,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int result = loginService.join(params);
		mv.setViewName("login");
		mv.addObject("resultCode", result);
		if (result == 1) {
			mv.addObject("resultMsg", "회원가입 성공");
		} else {
			mv.addObject("resultMsg", "회원가입 실패");
		}
		return mv;
	}
}


