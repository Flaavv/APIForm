package com.example.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
public class UsersRestService {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}
	@RequestMapping(value = "/user/{id}", method =RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return true;
		 
	}

}
