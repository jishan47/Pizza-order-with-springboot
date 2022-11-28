package com.zyapaar.pizzashop.pizzashop.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyapaar.pizzashop.pizzashop.services.cuisineServices;

@RestController
public class cuisineController {
    
    @GetMapping("cuisine")
    public ArrayList<String> getAll(){
       return cuisineServices.getAll();
    }



}
