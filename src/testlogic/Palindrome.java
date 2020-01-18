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
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nilai Pandronim Terbesar");
        System.out.print("Masukkan banyak digit n<=4: ");
        int digit = scan.nextInt();
        int nilai=0,
            palindrome=0;
        switch(digit){
            case 1: nilai=9;
                    break;
            case 2: nilai=99;
                    break;
            case 3: nilai=999;
                    break;
            case 4: nilai=9999;
                    break;
            default:System.out.println("Input salah!");
                    break;
        }
        for(int i=nilai;i>0;i--){
            for(int j=nilai;j>0;j--){
                int total = i*j;
                int temp = total;
                int sum=0,
                    remainder;
                while(total>0){
                    remainder=total%10;  //getting remainder  
                    sum=(sum*10)+remainder;    
                    total=total/10;
                }
                if(temp==sum){
                    if(palindrome<sum){
                        palindrome=sum;
                        break;
                    }
                }
            }
        }
        System.out.println("Nilai palindrome tertinggi : "+palindrome);
    }
    
}
