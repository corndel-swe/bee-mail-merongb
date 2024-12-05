package com.corndel;

public class Main {

    public static void main( String[] args ) {
        App app = App.getInstance();

        User alice = new User("1", "Alice");

        User bob = new User("2", "Bob");

        alice.login(app);
        bob.login(app);



        System.out.println(alice);
        System.out.println(bob);

        System.out.println(app.findUser("1"));

        // alice sends message to bob
        // alice will be stored on the mediator
        // sendMessage() -> sendMessage(recipientId: str, content: str)
        alice.sendMessage("2", "Hello world!");


    }
}
