package com.SpringBootRestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/Welcome")
	public String getMsg() {
		
		return "Welcome";
	}
	
}
