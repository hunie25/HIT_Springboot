package com.myapp.Week1.notification;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements INotificationService {
    public void sendNotification(String to, String message) {
        System.out.println("EMAIL -> " + to + ": " + message);
    }
}
