package com.management.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	User user=new User();
		user.setFirstName("Mohammed");
		user.setLastName("Mussa");
		user.setEmmail("mohammed@gmail.com");
	}

}
