package com.spring.kafka.dao;

import com.spring.kafka.daoimpl.Order;
import com.spring.kafka.response.Response;

public interface OrderDao {
    public Response save(Order oder);
}
