/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.homeworkinter;

/**
 *
 * @author Serebra
 */
public abstract class Plant implements Peellable {
    protected double weight;
    protected String colour;
    protected int rippness;//0:100 спелость
    protected int condition;// 0:100 шкала состояний
    protected boolean peeled;

    public Plant(double weight, String colour, int rippness, int condition,  boolean peeled) {
        this.weight = weight;
        this.colour = colour;
        this.rippness = rippness;
        this.condition = condition;
        this.peeled = peeled;
    }
    
    public Plant(){    
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
     public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if(condition <0 || condition >100){
            throw new IllegalArgumentException(
                    "condition cannot be lessthen 0 or more than 100");
        }
        this.condition = condition;
    }

    public int getRippness() {
        return rippness;
    }

    public void setRippness(int rippness) {
        if(rippness <0 || rippness > 100){
            throw new IllegalArgumentException(
                    "rippness cannot be lessthen 0 or more than 100");
        }
        this.rippness = rippness;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }
    
    public boolean isPeeled() {
        return peeled;
    }

        
}
