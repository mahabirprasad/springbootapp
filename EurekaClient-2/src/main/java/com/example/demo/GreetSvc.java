package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetSvc {
	@GetMapping("/greet")
	public String greetMsg() {
		return "good morning Bapi";
	}
}
