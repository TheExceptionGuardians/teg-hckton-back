package com.teg.messenger.web;

import com.teg.messenger.dao.IMessagesJPADao;
import com.teg.messenger.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    IMessagesJPADao dao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Message> listMessages(){
        List<Message> messages = dao.findAll();
        return messages;
    }
}
