package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

	@GetMapping
	@RequestMapping("/say")
	public String getGreeting(){
		return "Hello,Welcome to Spring-Boot with Docker application";
	}
}
