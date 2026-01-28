package com.auth.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.demo.versions.ApiVersions;

@RestController
@RequestMapping(ApiVersions.V1 + "/admin")
public class Admin {
	
//	@GetMapping
	public String adminEndpoint() {
		return "Hello from Admin!";
	}

}
