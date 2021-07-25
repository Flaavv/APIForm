package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.MpdTask;
import com.example.repository.MpdTaskRepository;

@RestController
public class MpdTaskRestService {
	
	@Autowired
	private MpdTaskRepository mpdTaskRepository;
	
	@GetMapping(value= "/mpdTasks")
	public List<MpdTask> getMpdTasks(){
		return mpdTaskRepository.findAll();
	}
	
	
}
