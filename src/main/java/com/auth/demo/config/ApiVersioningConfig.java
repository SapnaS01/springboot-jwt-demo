package com.auth.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.method.HandlerTypePredicate;

@Configuration
public class ApiVersioningConfig implements WebMvcConfigurer {

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {

		configurer.addPathPrefix(
				"/api/v1",
				HandlerTypePredicate.forBasePackage(
						"com.auth.demo.controller.v1"
						)
				);

		configurer.addPathPrefix(
				"/api/v2",
				HandlerTypePredicate.forBasePackage(
						"com.auth.demo.controller.v2"
						)
				);
	}
}
