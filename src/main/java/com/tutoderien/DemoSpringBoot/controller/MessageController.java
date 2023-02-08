package com.tutoderien.DemoSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tutoderien.DemoSpringBoot.data.MessageDAO;
import com.tutoderien.DemoSpringBoot.model.Message;

@Controller
public class MessageController {
	
	@Autowired
	private MessageDAO messageDAO;
	
	@PostMapping("/messages")
	public String postMessages(@ModelAttribute Message newMessage) {
		
		Message msg = new Message(newMessage.getAuthor(), newMessage.getMessages());
		messageDAO.save(msg);
		
		return "redirect:messages";
	}
	
	
	@GetMapping(value = "/messages")
	public String showMessages(Model model) {
			
		model.addAttribute("listeMessages", messageDAO.findAll());
		
		model.addAttribute("newMessage", new Message());
		return "messagesPage";
	}
}
	

