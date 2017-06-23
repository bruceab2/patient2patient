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
    String lastMessage;

    public Chat(Person chater, String date, String time) {
        this.chater = chater;
        this.date = date;
        this.time = time;
        lastMessage = "";
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public Person getChater() {
        return chater;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void addMessage(String s) {
        messageList.add(s);
    }

}
