package com.corndel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
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


}
