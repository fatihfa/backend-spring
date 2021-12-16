package com.example;




import com.example.services.UserService;

import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;

import com.example.models.Role;
import com.example.models.User;
import com.example.services.UserService;

import org.springframework.boot.CommandLineRunner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApiApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			// userService.saveRole(new Role(null, "ROLE_USER"));
			// userService.saveRole(new Role(null, "ROLE_MANAGER"));
			// userService.saveRole(new Role(null, "ROLE_ADMIN"));
			// userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService
					.saveUser(new User(null, "Fatih Farkhan", "fatihfarkhan21@gmail.com", "123456", new ArrayList<>()));
			userService.saveUser(new User(null, "Peter Parker", "pet", "123456", new ArrayList<>()));
			userService.saveUser(new User(null, "Tobey Maguire", "tob", "123456", new ArrayList<>()));
			userService.saveUser(new User(null, "Stephen Strange", "step", "123456", new ArrayList<>()));

			// userService.addRoleToUser("fatihfarkhan21@gmail.com", "ROLE_USER");
			// userService.addRoleToUser("pet", "ROLE_MANAGER");
			// userService.addRoleToUser("tob", "ROLE_ADMIN");
			// userService.addRoleToUser("tob", "ROLE_SUPER_ADMIN");
			// userService.addRoleToUser("step", "ROLE_MANAGER");

		};
	}
}
