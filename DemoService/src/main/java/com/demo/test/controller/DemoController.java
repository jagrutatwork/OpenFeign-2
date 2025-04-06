package com.demo.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {
	
	@GetMapping("/name")
	public String getName() {
		return "Demo Service";
	}
	
	@GetMapping("/address")
	public String geAddress() {
		return "Thane";
	}
	
	@GetMapping("/status")
	public String getStatus() {
		return "active";
	}
	

}
