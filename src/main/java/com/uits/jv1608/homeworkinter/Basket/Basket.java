/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.homeworkinter.Basket;

import com.uits.jv1608.homeworkinter.Fruits.Fruit;
import com.uits.jv1608.homeworkinter.Plant;
import com.uits.jv1608.homeworkinter.Vagatables.Vegetable;
import static java.lang.System.arraycopy;
import java.util.Arrays;

/**
 *
 * @author Serebra
 * @param <T>
 */
public class Basket <T extends Plant> {
    public T[] plants;
    private int size = 0;
    
    public Basket(){
        plants = (T[]) new Object[10];
    }
    
    public int size(){
        return this.size;
    }
    
    private void grow(int currentCapacity){//This method extends the Basket
        int newCapacity = currentCapacity + (currentCapacity >> 1);
            if(newCapacity - currentCapacity < 0)
                newCapacity = currentCapacity;
            plants = Arrays.copyOf(plants, newCapacity);
    }
    
    public void printBasket(){//This method prints the Basket
        for (Plant x : plants) {
            System.out.println(x);
        }
    }
    
    public void put(T val){//This method puts one plant in the Basket
        if(size == plants.length)
            grow(plants.length);
        plants[size++] = val;
    }
     
    public void put(T valSrc[]){//This method puts an array of plants in the Basket
        int gapArr = plants.length - valSrc.length;
        if(gapArr >= valSrc.length)
            arraycopy(valSrc, 0, plants, size, plants.length-1);
        else {
            grow(plants.length);
            arraycopy(valSrc, 0, plants, size, plants.length-1);
        }    
    }
    
    public void put(Basket a){//This method puts plants from other Basket to the Basket
        int gapBasket = this.plants.length - a.plants.length;
        if(gapBasket >= a.plants.length){
            arraycopy(a.plants, 0, this.plants, size, plants.length-1);
            a.size = 0;
        }
        else{
            grow(this.plants.length);
            arraycopy(a.plants, 0, this.plants, size, plants.length-1);
            a.size = 0;
        }
    }
    
    public void extract(int index){//This method extrscts one plant from the Basket
        System.arraycopy(plants, index+1, plants, index, plants.length-1-index);
        size -= 1;
    }
    
    public Object[] extractAll(){//This method eatracts all plants from the Basket
        Object[] extractArray = new Object [plants.length];
        System.arraycopy(plants, 0, extractArray, 0, plants.length);
        size = 0;
        return extractArray;
    }
    
    public void extractAllFruits(){//This method eatracts all fruits from the Basket
        for(int i=0; i<plants.length; i++){
            if(plants[i] instanceof Fruit){
                System.arraycopy(plants, i+1, plants, i, plants.length-1-i);
                size -= 1;
            }
        }
    }
    
    public void extractAllVegetables(){//This method eatracts all vegetables from the Basket
        for(int i=0; i<plants.length; i++){
            if(plants[i] instanceof Vegetable){
                System.arraycopy(plants, i+1, plants, i, plants.length-1-i);
                size -= 1;
            }
        }
    }
    
    public double getWeight(Basket a){//This method returns the Basket weight
        double basketWeight = 0.0;
        for (Plant x : a.plants) {
            basketWeight += x.getWeight();
        }
        return basketWeight;
    }
}
