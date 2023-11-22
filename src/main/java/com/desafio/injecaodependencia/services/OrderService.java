package com.desafio.injecaodependencia.services;

import com.desafio.injecaodependencia.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discontValue = 1 - (order.getDiscount() * 0.01);

        return order.getBasic() * discontValue + shippingService.shipment(order);
    }
}