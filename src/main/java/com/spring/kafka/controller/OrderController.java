package com.spring.kafka.controller;

import com.spring.kafka.response.Response;
import com.spring.kafka.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Response saveOrder() {
        return null;
    }
}
