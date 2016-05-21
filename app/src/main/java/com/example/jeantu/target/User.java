package com.example.jeantu.target;

/**
 * Created by jeantu on 5/20/16.
 */
public class User {
    private static User user = new User();
    private static String username;

    private User(){}

    public static User getUser() {
        return user;
    }

    void setUsername(String username){ //setting the username of the current user
        this.username = username;
    }

}


