package com.example.bruce.patient2patient;

import java.util.List;

/**
 * Created by bruce on 6/22/17.
 */

public class Chat {
    Person chater;
    List<String> messageList;
    String date;
    String time;

    public Chat(Person chater, String date, String time) {
        this.chater = chater;
        this.date = date;
        this.time = time;
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }
}
