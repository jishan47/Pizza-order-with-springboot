package com.zyapaar.pizzashop.pizzashop.services;

import com.zyapaar.pizzashop.pizzashop.model.Order;

public class orderServices {
    


    public static String show(Order order) {
        order.calculateAmount();
        String returnString = "You Selected  : " + order.getCuisine() + " Cuisine " + order.getCategory() + " Pizza "
                + "\n" + " Size- " + order.getSize() + " " + order.getPizza() 
                + " \n" + " Amount is " + order.getAmount();
        return returnString;
    }
}
  


