package com.teg.messenger.web;

import com.teg.messenger.model.Message;
import com.teg.messenger.repository.interfaces.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    MessageDao dao;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public List<Message> listMessages() {
        List<Message> messages = dao.findAll();
        return messages;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public Message addMessage(@RequestBody Message message) {
        dao.save(message);
        return message;
    }
}

