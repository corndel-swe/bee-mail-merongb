package com.corndel;

public interface Mediator {
    void addUser(User user);
    User findUser(String id);
    void deliverMessage(String id, String id1, String content);
}
