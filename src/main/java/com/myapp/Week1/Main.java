package com.myapp.Week1;
import com.myapp.Week1.payment.*;
import com.myapp.Week1.notification.*;
import com.myapp.Week1.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.myapp.Week1")
public class Main {
    public static void main(String[] args) {

        OrderService order1 = new OrderService(
                new MomoPayment(),
                new EmailNotification()
        );
        order1.processOrder("Huyền", "Laptop", 20000);
        OrderService order2 = new OrderService(
                new BankTransferPayment(),
                new SmsNotification()
        );
        order2.processOrder("Nam", "Phone", 10000);

        ApplicationContext context = SpringApplication.run(Main.class, args);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.processOrder("Lan", "Tablet", 5000);
        orderService.processOrder("Minh", "Phone", 3000);
    }
}
