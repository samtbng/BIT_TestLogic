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
public class PerfectTwo {
    public static void main(String[] args) {
        // TODO code application logic here
        int inputAngka,
                index0 = 0,
                index1 = 0,
                found = 0;
        int arr[] = {2,7,11,15};
        Scanner scan = new Scanner(System.in);
        System.out.println("Perfect Two <3");
        System.out.println("nilai array 2,7,11,15");
        System.out.print("Masukkan sebuah angka : ");
        inputAngka = scan.nextInt();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i!=j){
                    int total = arr[i]+arr[j];
                    if(inputAngka==total){
                        index0 = i;
                        index1 = j;
                        found = 1;
                        break;
                    }
                }
            }
            if(found==1){
                break;
            }
        }
        if(index0==0 && index1==0){
            System.out.println("<no way>");
        }else {
            System.out.println("["+index0+","+index1+"]");
        }
    }
}
