package com.myapp.Week1.payment;
import org.springframework.stereotype.Component;

@Component("bank")
public class BankTransferPayment implements IPaymentMethod {
    public void pay(double amount) {
        System.out.println("Chuyển khoản: " + amount);
    }

    public String getMethodName() {
        return "Bank Transfer";
    }
}
