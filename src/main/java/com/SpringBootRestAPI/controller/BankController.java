package com.SpringBootRestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/home")
	public String home()
	{
		String msg="Welcome to home";
		return msg;
	}
	@GetMapping("/balance")
	public String balance()
	{
		String msg="You current balance is : $$$$";
		return msg;
	}
	@GetMapping("/statement")
	public String statement()
	{
		String msg="Your statement generated and send to your email id";
		
		return msg;
	}
	@GetMapping("/myloan")
	public String myloan()
	{
		String msg="You dont have any loan";
		return msg;
	}
	@GetMapping("/contact")
	public String contact()
	{
		String msg="Thank,you for contacting customer support , we will get back to you soon";
		return msg;
	}
}
