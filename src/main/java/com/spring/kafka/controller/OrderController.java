package com.spring.kafka.controller;

import com.spring.kafka.response.Response;
import com.spring.kafka.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;


    public Response saveOrder(){

        return null;
    }
}
