package com.zyapaar.pizzashop.pizzashop.services;

import java.util.ArrayList;

import com.zyapaar.pizzashop.pizzashop.model.Pizza;

public class pizzaServices {

    public static ArrayList<String> getAll() {
        ArrayList<String> pizza = new ArrayList<String>();
        pizza.add("Tomchi");
        pizza.add("Caponito");
        pizza.add("Red Indian");
        pizza.add("Party Lovers");
        pizza.add("American Heat");
        pizza.add("Re-Union");
        return pizza;
    }

    public static ArrayList<String> getAll(String category) {

        ArrayList<String> pizza = new ArrayList<String>();
        if (category.equalsIgnoreCase("Regular")) {
            pizza.add("Tomchi");
            pizza.add("Caponito");
        } else if (category.equalsIgnoreCase("Premium")) {
            pizza.add("Red Indian");
            pizza.add("Party Lovers");
        } else {
            pizza.add("American Heat");
            pizza.add("Re-Union");
        }
        return pizza;

    }
 
    
        public static ArrayList<String> getToppings(Pizza objpizza){
        ArrayList<String> list =  new ArrayList<>();
        String pizza = objpizza.getPizzaName();
         if (pizza.equalsIgnoreCase("Tomchi")) {
            list.add("Tomato");
            list.add("Onion");
            list.add("Chilly & Cheese");
        } else if (pizza.equalsIgnoreCase("Caponito")) {
            list.add("Capsicum");
            list.add("Onion");
            list.add("Tomato & cheese");
        } else if (pizza.equalsIgnoreCase("Red Indian")) {
            list.add("Cheese");
            list.add("Paneer");
            list.add("Chilly");
        } else if (pizza.equalsIgnoreCase("Party Lovers")) {
            list.add("Cheese");
            list.add("Sweet Corn");
            list.add("Capsicum");
            list.add("Tomato");
        } else if (pizza.equalsIgnoreCase("American Heat")) {
            list.add("Cheese");
            list.add("Capsicum");
            list.add("Baby Corn");
        } else if (pizza.equalsIgnoreCase("Re-Union")) {
            list.add("Cheese");
            list.add("Capsicum");
            list.add("Spainach");
            list.add("Baby Corn");
            list.add("Olives");
        }
        return list;
    }

}
