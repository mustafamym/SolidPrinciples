package com.example.demo.solid.dip.withdip;

// Low-level module
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

