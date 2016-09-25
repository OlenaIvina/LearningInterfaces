/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.homeworkinter.Vagatables;

/**
 *
 * @author Serebra
 */
public class Potato extends Vegetable {

    public Potato() {
    }

    public Potato(double weight, String colour, int condition, int rippness, boolean peeled) {
        super(weight, colour, condition, rippness, peeled);
    }
    
    @Override
    public String toString(){
        return " Potato{" +
                "weight = " + weight + ";" +
                " colour is " + colour + ";" +
                " condition = " + condition + ";" +
                " rippness = " + rippness + ";" +
                " peeled = " + peeled + "}";
                
    }
}
