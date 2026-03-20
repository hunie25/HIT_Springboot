package com.myapp.Week1.payment;
import org.springframework.stereotype.Component;

@Component("momo")
public class MomoPayment implements IPaymentMethod {
    public void pay(double amount) {
        System.out.println("Thanh toán MoMo: " + amount);
    }

    public String getMethodName() {
        return "MoMo";
    }
}
