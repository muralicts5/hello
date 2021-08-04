package com.example.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String sayHello() {
			return "hello";
	}
	
	@PostMapping("/postdata")
	public Greeting sayHello12(@RequestBody Greeting greeting) {
		greeting.setMessage("Hi msg");
		return greeting;
	}
}
