package com.myapp.Week1.payment;

public interface IPaymentMethod {
    void pay(double amount);
    String getMethodName();
}
