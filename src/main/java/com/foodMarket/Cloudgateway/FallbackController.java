package com.foodMarket.Cloudgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/orderFallback")
    public Mono<String> OrderServiceFallback() {
        System.out.println("Order Service Fallback invoked");
        return Mono.just("Order service is taking too long to respond or is down. Please try again later");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> PaymentServiceFallback() {
        System.out.println("Payment Service Fallback invoked");
        return Mono.just("Payment service is taking too long to respond or is down. Please try again later");
    }
}
