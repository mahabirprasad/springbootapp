package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Autowired
	public GreeatServiceClient greetClient;

	@GetMapping("welcome")
	public String welcomeMsg() {
		String welcomeMsg = "hi Bapi";
		String greetMsg = greetClient.invokeGreetService();
		String finalmsg = welcomeMsg + " " + greetMsg;
		return finalmsg;

	}
}
