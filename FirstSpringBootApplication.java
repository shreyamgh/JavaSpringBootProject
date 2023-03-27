package com.springboot.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class FirstSpringBootApplication {
	
	@GetMapping("/welcome")

	public String welcome() {
		return "welcome to spring boot first application";
		// TODO Auto-generated method stub

	}

}
