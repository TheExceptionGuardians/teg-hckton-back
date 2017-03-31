package com.teg.messenger.dao;

import com.teg.messenger.model.Message;

import java.util.List;

/**
 * Created by EQTIC-PROD-OIF on 31/03/2017.
 */
public interface MongoDao {

    public List<Message> getMessages();
}
