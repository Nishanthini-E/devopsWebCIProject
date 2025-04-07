package com.devopsweb.devopsDemoCI_WebProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDemoCiWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoCiWebProjectApplication.class, args);
	}
		@GetMapping("/")
	    public String hello() {
	      return String.format("<h1>Hello!!! Welcome to Web Application</h1>");
	    }
	

}


