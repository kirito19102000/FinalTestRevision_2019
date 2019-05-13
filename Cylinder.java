/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_review;

/**
 *
 * @author Admin
 */
public class Cylinder extends Circle implements Shape{
    private double height;
    //This is Parameterized 
    public void Cylinder(double height){
        this.height = height;
    }
    //This is non-Paramterized
    public void NonCylinder(double height){
        height = 0.0;
    }
    @Override
    public double getArea(){
        return super.getArea()*this.height;
    }
    
    public double getLSurface(){
        return Math.PI*2*super.radius*this.height;
    }
    @Override
    public String toString(){
        return String.format("Cylinder Area: %.2f, Cylinder volume: %.2f", this.getArea(), this.getLSurface());
    }

    
}
