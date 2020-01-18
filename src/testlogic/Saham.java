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
public class Saham {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jual Beli Saham");
        System.out.print("Masukkan jumlah array :");
        int length = scan.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < length;i++){
            System.out.print("masukkan nilai saham : ");
            int input = scan.nextInt();
            array.add(input);
        }
        List<Integer> profit = new ArrayList<Integer>();
        for(int i = 0; i < array.toArray().length-1;i++){
            int saham = 0;
            int totalSaham = 0;
            for(int j = i; j < array.toArray().length-1;j++){
               int temp = array.get(j+1)-array.get(j);
                saham = saham + temp;
                if(totalSaham<saham){
                    totalSaham=saham;
                }
            }
            profit.add(totalSaham);
        }
        int profitTertinggi=0;
        for(int i = 0; i < profit.toArray().length; i++){
            if(profitTertinggi<profit.get(i)){
                profitTertinggi=profit.get(i);
            }
        }
        if(profitTertinggi==0){
            System.out.println("harga selalu turun");
        }else {
            System.out.println("nilai saham tertinggi : "+profitTertinggi);
        }
    }
}
