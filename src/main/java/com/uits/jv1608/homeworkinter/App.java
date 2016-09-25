/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.homeworkinter;

import com.uits.jv1608.homeworkinter.Basket.Basket;
import com.uits.jv1608.homeworkinter.Fruits.Apple;
import com.uits.jv1608.homeworkinter.Fruits.Banana;
import com.uits.jv1608.homeworkinter.Fruits.Orange;
import com.uits.jv1608.homeworkinter.Fruits.Pear;
import com.uits.jv1608.homeworkinter.Vagatables.Carrot;
import com.uits.jv1608.homeworkinter.Vagatables.Onion;
import com.uits.jv1608.homeworkinter.Vagatables.Potato;
import com.uits.jv1608.homeworkinter.Vagatables.Salary;
import java.util.ArrayList;

/**
 *
 * @author Serebra
 */
public class App {
    public static void main(String[] args) {
        Apple a = new Apple(0.2, "red", 99, 70, false);
        Banana b = new Banana(0.3, "yellow", 100, 100, false);
        Orange o = new Orange(0.25, "orange", 100, 100, false);
        Pear p = new Pear(0.4, "green", 100, 100, false);
        
        Carrot c = new Carrot(0.3, "yellow", 100, 100, false);
        Onion on = new Onion(0.2, "white", 100, 100, false);
        Potato po = new Potato(0.5, "brown", 100, 100, false);
        Salary s = new Salary(0.1, "green", 100, 100, false);
        
        Basket basket1 = new Basket();
        
        basket1.put(a);
        basket1.put(b);
        basket1.put(o);
        basket1.put(p);
        basket1.put(c);
        basket1.put(on);
        basket1.put(po);
        basket1.put(s);
        
        basket1.printBasket();
        
        
        
    }    
}
