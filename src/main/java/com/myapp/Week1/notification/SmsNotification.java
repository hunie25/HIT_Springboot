package com.myapp.Week1.notification;
import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotification implements INotificationService {
    public void sendNotification(String to, String message) {
        System.out.println("SMS -> " + to + ": " + message);
    }
}
