package com.teg.messenger.repository.interfaces;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.teg.messenger.model.Message;

public interface MessageDao extends MongoRepository<Message, Long>{
	
	List<Message> findMessageByMsgLike(String msg);
	
	List<Message> findAll();
	
	Message save(Message msg);

}
