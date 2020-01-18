/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlogic;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Origami {
    public static void main(String[] args) {
        int fold,
            dimension1=20,
            dimension2=20;
        Scanner scan = new Scanner(System.in);
        System.out.println("Origami");
        System.out.print("inser n-fold : ");
        fold = scan.nextInt();
        for(int i = 0; i<fold; i++){
            if(dimension1==dimension2){
                dimension1 = dimension1/2;
            }else{
                dimension2 = dimension2/2;
            }
        }
        System.out.println("in "+fold+" folds makes the dimension is "+dimension1+"cm*"+dimension2+"cm");
        
    }
    
}
