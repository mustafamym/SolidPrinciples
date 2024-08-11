package com.example.demo.solid.dip.withdip;

// High-level module
public class NotificationService {
    private Notification notification;

    // Dependency injection via constructor
    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notify(String message) {
        notification.send(message);
    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification(); // Concrete implementation
        NotificationService emailNotificationService = new NotificationService(emailNotification); // Inject dependency
        emailNotificationService.notify("NotificationService Email:Hello, world!");

        Notification smsNotification = new SMSNotification(); // Another concrete implementation
        NotificationService smsNotificationService = new NotificationService(smsNotification); // Inject dependency
        smsNotificationService.notify("NotificationService SMS :Hello, world!");
    }
}

//
//In this approach:
//NotificationSender is the abstraction.
//EmailService is the implementation detail.
//NotificationService depends on the abstraction, not the concrete implementation.

//Benefits:
//Loose coupling: NotificationService is independent of the specific notification method.
//Testability: We can easily mock or stub NotificationSender for testing.
//Extensibility: Adding new notification methods
// (e.g., SMS, push notifications) is straightforward by creating new implementations
// of NotificationSender.