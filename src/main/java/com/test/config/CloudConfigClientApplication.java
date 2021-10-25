package com.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudConfigClientApplication {
		
		@Value("${greeting.message}")
		private String greetingText;
		
	    @RequestMapping("/")
	    public String home() {
	        return "Hello World!";
	    }
	    
	    @RequestMapping("/config")
	    public String greet() {
	    	return greetingText;
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientApplication.class, args);
	}

}
