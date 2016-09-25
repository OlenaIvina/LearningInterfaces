/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.homeworkinter.Fruits;

/**
 *
 * @author Serebra
 */
public class Orange extends Fruit{
    
    public Orange(){
    }
    
    public Orange(double weight, String colour, int condition, int rippness, boolean peeled) {
        super(weight, colour, condition, rippness, peeled);
    }
    
    @Override
    public String toString(){
        return " Orange{" +
                "weight = " + weight + ";" +
                " colour is " + colour + ";" +
                " condition = " + condition + ";" +
                " rippness = " + rippness + ";" +
                " peeled = " + peeled + "}";
    }
}
