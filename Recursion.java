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
import java.util.*;
public class Recursion {
    public static int Re1(int n){
        if(n==0){
            return 4;
        }
        else{
            if(n==1){
                return 3;
            }
        }
        return Re1(n-1)-Re1(n-2);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Insert n:");
        int n = in.nextInt();
        System.out.print("Resursion1: " + Re1(n));
    }
}
