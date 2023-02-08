package com.tutoderien.DemoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutoderien.DemoSpringBoot.data.MessageDAO;
import com.tutoderien.DemoSpringBoot.model.Message;

@CrossOrigin("*")
@RestController
public class MessageRestController {
	
	@Autowired
	MessageDAO messageDAO;
	
	
	@GetMapping("/api/messages")
	public List<Message> listeMessages(){
		return messageDAO.findAll();
	}
	
	@PostMapping("/api/messages")
	public void postMessage(@RequestBody Message message) {
		messageDAO.save(message);
	}

}
