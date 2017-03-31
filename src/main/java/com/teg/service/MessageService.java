package com.teg.service;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import com.teg.messenger.model.Message;

@Service
public class MessageService {
		
	@SendTo("/topic/message")
	public Message send(Message message) throws Exception {
		
	    return message;
	}

}
