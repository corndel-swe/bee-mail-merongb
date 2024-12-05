package com.corndel;

import lombok.*;

@Getter
@ToString
public class User {

        private String id;
        private String username;
        private App app;


    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }


    public void login(App app) {
        this.app = app;
        app.addUser(this);
    }


    public void sendMessage(String id, String content) {
        // deliverMessage(senderId: str, recipientId: str, content: str)
        app.deliverMessage(this.id, id, content);
    }
}
