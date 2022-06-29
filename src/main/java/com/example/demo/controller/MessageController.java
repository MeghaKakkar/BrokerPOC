package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PublisherService;

@RestController
@RequestMapping(value="/message")
public class MessageController {
	
	@Autowired
	PublisherService publisherService;
	
	@PostMapping(value="/send")
	public ResponseEntity<String> sendMessage(@RequestBody String message) {
		publisherService.sendMessage(message);
		return new ResponseEntity<String>("Message sent : "+message, HttpStatus.OK);
	}

}
