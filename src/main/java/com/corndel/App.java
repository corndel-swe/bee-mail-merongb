package com.corndel;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App implements Mediator{

    private static App instance;
    private final Map<String, User> users = new HashMap<>();

    private final List<Message> messages = new ArrayList<>();


    private App() {};

    static App getInstance() {
        if (instance == null) {
            instance = new App();
        }   else {
            System.out.println("App already exists");
        }

    return instance;
    }

    @Override
    public void addUser(User user) {
        if (!users.containsKey(user.getId())) {
            users.put(user.getId(), user);
        }   else {
            System.out.printf("User %s already exists", user.getUsername());
        }
    }

    @Override
    public User findUser(String id) {
        return users.get(id);
    }

    @Override
    public void deliverMessage(String id, String recipientId, String content) {
        // create a new message
        User user1 = findUser(id);
        User user2 = findUser(recipientId);

        Message message = new Message();
        message.setContent(content);
        message.setFrom(user1);
        message.setTo(user2);
        messages.add(message);

       message.isDelivered();


        // DO REST ANOTHER TIME....

    }

    @Override
    public List<Message> receiveMessages(String recipientId) {
        List<Message> userMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.getTo().getId().equals(recipientId)) {
                userMessages.add(message);
            }
        }
        return userMessages;
    }
}
