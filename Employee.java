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
public abstract class Employee {
    protected String name;
    protected String DOB;
    protected double basicPay;
    //This is Parameterized
    public void Employee(String name, String DOB, double basicPay){
        this.DOB = DOB;
        this.basicPay = basicPay;
        this.name= name;
    }
    //This is Non--Parameterized
    public void NonEmployee(String name, String DOB, double basicPay){
        DOB = null;
        name = null;
        basicPay = 0;
    }
    public abstract double getSalary();
}
