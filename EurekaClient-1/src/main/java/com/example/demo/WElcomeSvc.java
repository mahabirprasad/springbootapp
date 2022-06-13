package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WElcomeSvc {
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "hi Bapi";
	}

}
