package com.corndel;

import java.util.List;

public interface Mediator {
    void addUser(User user);
    User findUser(String id);
    void deliverMessage(String id, String id1, String content);
    List<Message> receiveMessages(String recipientId);


}
