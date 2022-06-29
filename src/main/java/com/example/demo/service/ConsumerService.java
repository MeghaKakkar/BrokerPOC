package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@JmsListener(destination="${jms.queue.name}")
	public void receiveMessage(String message) {
		System.out.println("Received message : "+message);
	}
	
}
