package com.myapp.Week1.service;
import com.myapp.Week1.payment.IPaymentMethod;
import com.myapp.Week1.notification.INotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final IPaymentMethod paymentMethod;
    private final INotificationService notificationService;

    public OrderService(
            @Qualifier("momo") IPaymentMethod paymentMethod,
            @Qualifier("email") INotificationService notificationService
    ) {
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    public void processOrder(String customer, String product, double amount) {
        System.out.println("Khách: " + customer + " | Sản phẩm: " + product);
        paymentMethod.pay(amount);
        notificationService.sendNotification(customer, "Thanh toán bằng " + paymentMethod.getMethodName());
        System.out.println("-----");
    }
}
