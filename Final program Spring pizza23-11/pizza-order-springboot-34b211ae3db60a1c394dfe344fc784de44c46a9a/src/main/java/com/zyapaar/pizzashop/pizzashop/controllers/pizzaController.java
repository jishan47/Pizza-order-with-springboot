package com.zyapaar.pizzashop.pizzashop.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zyapaar.pizzashop.pizzashop.model.Pizza;
import com.zyapaar.pizzashop.pizzashop.services.pizzaServices;

@RestController
public class pizzaController {

    @GetMapping("pizza")
    public ArrayList<String> getAll(){
        return pizzaServices.getAll();
     }

     @GetMapping("pizza/{category}")
    
     public ArrayList<String> getAllbypathvariable(@PathVariable String category){
        return pizzaServices.getAll(category);
     }

     @PostMapping("pizza")

     public ArrayList<String> getallbypost(@RequestBody String category){
            return pizzaServices.getAll(category);
     }

     @PostMapping("toppings")
     public List<String> getToppings(@RequestBody Pizza pizza){
      return pizzaServices.getToppings(pizza);
     }
}
