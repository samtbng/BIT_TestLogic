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
public class TestLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Test Logic PT. Barito Integra Teknologi");
        System.out.println("1.Perfect Two");
        System.out.println("2.Origami");
        System.out.println("3.Optimus Prime");
        System.out.println("4.Saham");
        System.out.println("5.Palindrome");
        System.out.println("6.Programmer It");
        System.out.print("Masukkan nomor soal : ");
        soal = scan.nextInt();
        switch(soal){
            case 1:
                PerfectTwo.main(args);
                break;
            case 2:
                Origami.main(args);
                break;
            case 3:
                Prime.main(args);
                break;
            case 4:
                Saham.main(args);
                break;
            case 5:
                Palindrome.main(args);
                break;
            case 6:
                HotDog.main(args);
                break;
            default:
                System.out.println("Nomor yang anda masukkan salah!");
                System.exit(0);
        }
    }
    
}
