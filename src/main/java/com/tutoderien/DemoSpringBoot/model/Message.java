package com.tutoderien.DemoSpringBoot.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String author;
	private LocalDateTime timestamp;
	private String messages;
	

	public Message(String author, String message) {
		super();
		this.timestamp = LocalDateTime.now();
		this.author = author;
		this.messages = message;
	}

	public Message() {
		super();
		this.timestamp = LocalDateTime.now();
	}
	
	public Message(String author) {
		super();
		this.author = author;
		this.timestamp = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String message) {
		this.messages = message;
	}
	
	
}
