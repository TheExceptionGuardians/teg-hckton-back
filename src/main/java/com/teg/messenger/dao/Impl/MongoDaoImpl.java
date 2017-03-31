package com.teg.messenger.dao.Impl;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.teg.messenger.dao.MongoDao;
import com.teg.messenger.model.Message;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MongoDaoImpl implements MongoDao {

    @Override
    public List<Message> getMessages() {

        List<Message> messages = new ArrayList<>();

        MongoClient client = new MongoClient(new ServerAddress("192.168.1.41", 27017));
        MongoDatabase db = client.getDatabase("teg");
        MongoCollection<Document> col = db.getCollection("messages");
        Iterable<Document> iterator = col.find();
        for (Document document : iterator) {
            Message message = new Message();
            message.setMsg(document.getString("msg"));
            message.setCreated(document.getDate("created"));
            messages.add(message);
        }

        return messages;
    }
}
