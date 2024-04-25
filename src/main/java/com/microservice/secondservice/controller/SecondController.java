package com.microservice.secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class SecondController {

	@GetMapping("/message")
	public String test() {
		return "Hello from Second Service";
	}
	@GetMapping("/show")
	public String display() {
		return "Hello from Second Service";
	}
}