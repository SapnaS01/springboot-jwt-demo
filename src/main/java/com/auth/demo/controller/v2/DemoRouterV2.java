package com.auth.demo.controller.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRouterV2 {
	
	@GetMapping
	public String test() {
		return "Test v2";
	}

}
