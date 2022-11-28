package com.zyapaar.pizzashop.pizzashop.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyapaar.pizzashop.pizzashop.services.sizeServices;

@RestController
public class sizeController {

    @GetMapping("size")
    public ArrayList<String> getAll(){
        return sizeServices.getAll();
        

    }
    
}
