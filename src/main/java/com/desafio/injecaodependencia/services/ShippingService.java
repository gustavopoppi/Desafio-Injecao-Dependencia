package com.desafio.injecaodependencia.services;

import com.desafio.injecaodependencia.models.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        double orderValue = order.getBasic();

        if (orderValue >= 200)
            return 0.0;

        return orderValue < 100 ? 20.0 : 12.0;
    }
}