/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.homeworkinter.Vagatables;

import com.uits.jv1608.homeworkinter.Plant;

/**
 *
 * @author Serebra
 */
public class Vegetable extends Plant {

    public Vegetable(){
        super();
    }

    public Vegetable(double weight, String colour, int rippness, int condition, boolean peeled) {
        super(weight, colour, rippness, condition, peeled);
    }
    
    @Override
    public void peel() {

        this.setWeight(this.getWeight()*0.95);
        this.peeled = true;
        this.setPeeled(this.peeled);
    }
    
}
