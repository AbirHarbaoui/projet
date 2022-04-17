package com.example.cotroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InterfaceController {

	@GetMapping("/")
	public String home() {
		return"index.html";
	}
	
	@GetMapping("test")
	public String home5() {
		return"test.html";
	}
	
	
	@GetMapping("/reg")
	public String home1() {
		return"registration.html";
	}
	
	
	@GetMapping("/rech")
	public String home2() {
		return"rechercher.html";
	}
	
	
	@GetMapping("/supp")
	public String home3() {
		return"supprimer.html";
	}
	@GetMapping("/modif")
	public String home6() {
		return"modifier.html";
	}
	

	
	
}
