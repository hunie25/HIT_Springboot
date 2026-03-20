package com.myapp.Week1.payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class CashPayment implements IPaymentMethod {
    public void pay(double amount) {
        System.out.println("Thanh toán tiền mặt: " + amount);
    }

    public String getMethodName() {
        return "Cash";
    }
}
