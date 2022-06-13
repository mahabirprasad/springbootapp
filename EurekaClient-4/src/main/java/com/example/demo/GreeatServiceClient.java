package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-SERVICE")
public interface GreeatServiceClient {

	@GetMapping("/greet")
	public String invokeGreetService();
}
