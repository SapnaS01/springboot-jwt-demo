package com.auth.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRouter {
	
	@GetMapping
	public String hello() {
		return "Hello from DemoRouter!";
	}

}
