package com.auth.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/header-versioning")
public class HeaderVersioning {
	
	@GetMapping(value="/demo",headers="X-API-VERSION=1")
	public String headerVersioning() {
		return "Header Versioning";
	}

}
