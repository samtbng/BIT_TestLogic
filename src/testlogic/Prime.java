/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Optimus Prime");
        System.out.print("insert total array :");
        int total = scan.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < total;){
            System.out.println("masukkan nilai array n>2 && n<1.000.000: ");
            int input = scan.nextInt();
            if(input>2 && input<1000000){
                array.add(input);
                 i++;
            }else{
                System.out.println("input salah!");
            }
        }
        System.out.println("array : "+array);
        //remove duplicate value
        for(int i=0;i<array.toArray().length; i++){
            for(int j=0;j<array.toArray().length; j++){
                if(array.get(i)==array.get(j) && i!=j){
                    array.remove(j);
                }
            }
        }
        for(int i=0; i<array.toArray().length; i++){
            int flag = 0;
            for(int j=2;j<array.get(i);j++){
                if(array.get(i)%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(array.get(i)+" is a prime number");
            } else {
                System.out.println(array.get(i)+" is not a prime number");
            }
        }
    }
}
