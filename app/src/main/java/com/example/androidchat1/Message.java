package com.example.androidchat1;

import java.util.Date;

public class Message {
    public String userName;
    public String userMessage;
    private Long messageTime;

    public Message(String userName, String userMessage){
        this.userName = userName;
        this.userMessage = userMessage;
        this.messageTime = new Date().getTime();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public Long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Long messageTime) {
        this.messageTime = messageTime;
    }
}
