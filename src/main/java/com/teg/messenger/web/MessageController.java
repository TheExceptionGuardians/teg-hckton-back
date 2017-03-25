package com.teg.messenger.web;

import com.teg.messenger.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Message> listMessages(){
        return new ArrayList<>();
    }
}
