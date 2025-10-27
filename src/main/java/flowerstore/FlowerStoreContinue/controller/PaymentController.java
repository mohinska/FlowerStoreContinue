package flowerstore.flowerstorecontinue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import flowerstore.flowerstorecontinue.payment.CreditCardPaymentStrategy;
import flowerstore.flowerstorecontinue.payment.PayPalPaymentStrategy;
import flowerstore.flowerstorecontinue.payment.Payment;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping
    public String pay(
            @RequestParam String strategy,
            @RequestParam double price) {
        // 1. Вибираємо стратегію оплати на основі параметра
        Payment paymentStrategy;
        if (strategy.equalsIgnoreCase("creditcard")) {
            paymentStrategy = new CreditCardPaymentStrategy();
        } else if (strategy.equalsIgnoreCase("paypal")) {
            paymentStrategy = new PayPalPaymentStrategy();
        } else {
            return "Error: Unknown payment strategy.";
        }

        // 2. Запускаємо "оплату"
        if (paymentStrategy.pay(price)) {
            return "Payment successful using " + strategy;
        } else {
            return "Payment failed.";
        }
    }
}