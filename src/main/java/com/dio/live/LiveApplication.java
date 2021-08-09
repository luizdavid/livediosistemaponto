package com.dio.live;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiveApplication {

	public static void main(String[] args) {
		   SpringApplication app = new SpringApplication(LiveApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8081"));
	        app.run(args);
	        
		 
	}

}
