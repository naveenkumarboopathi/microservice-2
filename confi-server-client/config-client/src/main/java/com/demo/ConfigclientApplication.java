package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class ConfigclientApplication {


	@Value("${welcome.message}")
	String welcomeText;
	
	
	@Value("${hello}")
	String hello;

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}

	@GetMapping("/samples")
	public String check() {
		System.out.println(welcomeText);
		System.out.println(hello);
		return "working";
	}

}
