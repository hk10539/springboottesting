package com.project1.springboottesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringboottestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestingApplication.class, args);
	}
	@GetMapping("/")
	public String homepage(){
		return "Homepage";
	}

}
