package com.example.service;

import com.example.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
