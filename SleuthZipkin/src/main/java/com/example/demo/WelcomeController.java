package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.info("execution started");
		String msg = "Hi Mahwir how are you";
		logger.info("excution ended");
		return msg;
	}
}
