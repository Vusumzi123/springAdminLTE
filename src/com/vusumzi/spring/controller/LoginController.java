package com.vusumzi.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView loginView(HttpServletRequest request){
		ModelAndView model = new ModelAndView("login");		
		return model;
	}
}
