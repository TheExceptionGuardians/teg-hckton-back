package com.teg.messenger.dao;

import com.teg.messenger.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMessagesJPADao extends MongoRepository<Message, String> {
}
