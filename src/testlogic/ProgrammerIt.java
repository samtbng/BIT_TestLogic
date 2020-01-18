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
public class ProgrammerIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dictionary = {"pro","gram","merit","program","programmer","it"};
        System.out.println("Programmer IT");
        System.out.print("Masukkan kata :");
        String input = scan.nextLine();
        int success=0;
        for(int i=0;i<dictionary.length;i++){
            List<String> output = new ArrayList<String>();
            String process = input;
            String valid = dictionary[i];
            String validSub = "";
            if(valid.length()<=process.length()){
                validSub = process.substring(0, valid.length());
            }
            if(valid.equals(validSub)){
                output.add(validSub);
                process = process.substring(valid.length());
                for(int j=0;j<dictionary.length;j++){
                    String kata = dictionary[j];
                    String sub="";
                    if(kata.length()<=process.length()){
                        sub = process.substring(0, kata.length());
                    }
                    if(kata.equals(sub)){
                        output.add(sub);
                        process = process.substring(kata.length());
                    }
                }
            }
            if(process.equals("")){
                System.out.println(output);
                success++;
            }
        }
        if(success<=1){
            System.out.println("<no way>");
        }
    }
}
