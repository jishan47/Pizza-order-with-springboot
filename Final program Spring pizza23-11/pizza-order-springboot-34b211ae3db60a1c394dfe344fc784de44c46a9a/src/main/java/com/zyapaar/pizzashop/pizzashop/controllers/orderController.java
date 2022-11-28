package com.zyapaar.pizzashop.pizzashop.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zyapaar.pizzashop.pizzashop.model.Order;
import com.zyapaar.pizzashop.pizzashop.services.orderServices;

@RestController
public class orderController {


    @PostMapping("order")
    public String placeorder(@RequestBody Order order) {
        return orderServices.show(order);
    }
   
}
