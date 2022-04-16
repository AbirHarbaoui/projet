package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {

	
	@GetMapping("/")
	public String home() {
		return"index";
	}
	
	@GetMapping("test")
	public String home5() {
		return"test";
	}
	
	
	@GetMapping("/reg")
	public String home1() {
		return"registration";
	}
	
}
