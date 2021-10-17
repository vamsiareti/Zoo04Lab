/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *PolarBear class (derived from subclass of superclass Animal)
 * @author Maddelavedu Pravallika
 */
public class PolarBear extends Animal {
    
    /** 
     * 
     * PolarBear constructor
     * 
     * @param name - the name of this PolarBear
     */
    
     public PolarBear(String name) {
       super(name); 
    }
    
    @Override
    public void move() {
        System.out.println(" Its head from side to side when it wants to play with another");
    }
    
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an polarBear! \n",this.name);
    }
    
    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getPolarBearAddition(a,b);
        System.out.printf("I know PolarBearAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
    
    /**
     *  custom PolarBear function - your class must use a unique function name
     *  unique first parameter identifier unique second parameter identifier do
     *  something creative
     * 
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    
    public double getPolarBearAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
    public static void main(String[] args) {
        var a = new PolarBear("Tester");
        a.speak();
        a.move();
        a.profess();
    }

    
    
}
