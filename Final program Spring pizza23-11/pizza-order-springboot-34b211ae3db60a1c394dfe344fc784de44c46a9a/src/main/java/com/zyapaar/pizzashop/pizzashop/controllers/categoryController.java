package com.zyapaar.pizzashop.pizzashop.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyapaar.pizzashop.pizzashop.services.categoryService;

@RestController
public class categoryController {

    @GetMapping("category")
    public ArrayList<String> getAll(){
        return categoryService.getAll();
    }
    
}
