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
public class Accountant extends Employee{
    private double rate;
    //This is parameterized 
    public void Accountant(double rate){
        this.rate = rate;
    }
    @Override
    public double getSalary() {
        return this.rate*this.basicPay;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return String.format("Accounttant salary: %.2f", this.getSalary());
    }
}
