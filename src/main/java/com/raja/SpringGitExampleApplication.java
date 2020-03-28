package com.raja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringGitExampleApplication {
	
	@GetMapping("/getData")
	public String getData() {
		System.out.println("________________-");
		return "dummy Data";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGitExampleApplication.class, args);
	}

}
