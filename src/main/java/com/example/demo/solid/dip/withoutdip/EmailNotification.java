package com.example.demo.solid.dip.withoutdip;

//// Low-level module
public class EmailNotification {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
