package com.example.demo.solid.dip.withoutdip;

//  High-level module
public class NotificationService {
    private EmailNotification emailNotification;

    public NotificationService() {
        this.emailNotification = new EmailNotification(); // Tight coupling
    }

    public void notify(String message) {
        emailNotification.sendEmail(message);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notify("Hello, world!");
    }

}

//This approach creates tight coupling between NotificationService and EmailService.
// If we want to use a different notification method (e.g., SMS),
// making it difficult to switch