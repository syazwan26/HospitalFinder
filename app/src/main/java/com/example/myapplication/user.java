package com.example.myapplication;

public class user {
    String user;
    String userID;
    String email;
    String currentTime;

    public user(String userID, String user, String email, String currentTime) {
        this.userID = userID;
        this.user = user;
        this.email = email;
        this.currentTime = currentTime;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public String getUserID() {
        return userID;
    }
}