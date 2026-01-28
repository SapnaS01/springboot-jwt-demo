package com.auth.demo.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRouterV1 {
		
	@GetMapping
	public String test() {
		return "Test v1";
	}

}
