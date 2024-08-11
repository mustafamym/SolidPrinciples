package com.example.demo.solid.dip.withdip;

// Another implementation of the abstraction
public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}