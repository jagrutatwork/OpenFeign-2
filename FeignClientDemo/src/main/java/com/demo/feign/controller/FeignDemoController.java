package com.demo.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.feign.util.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/user-name")
	public String getUserName() {
		return feignServiceUtil.getName();
	}
	
	@GetMapping("/user-address")
	public String getAddress() {
		return feignServiceUtil.getAddress();
	}
	
	@GetMapping("/user-status")
	public String getStatus() {
		return feignServiceUtil.getStatus();
	}

}
