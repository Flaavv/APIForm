package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan({"com.example.repository.UserRepository"})
public class DemoMpdApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoMpdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(1L, "Flavien", "Laffont", "admin", null));
		userRepository.save(new User(2L, "Lucie", "Pilarski", "admin", null));
		userRepository.save(new User(3L, "Suceur", "Deboule", "admin", null));
		userRepository.save(new User(4L, "Chieur", "Denfant", "admin", null));
		System.out.print(userRepository.findAll());
	
	}

}
