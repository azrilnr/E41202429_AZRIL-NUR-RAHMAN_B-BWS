/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class TugasA {

    public static void main(String[] args) {
        
        System.out.println("Tugas A");
        System.out.println();
        
        Scanner sc  = new Scanner (System.in);
        
        int awal_bilangan, akhir_bilangan;
        
        System.out.print("Bilangan awal : ");
        awal_bilangan = sc.nextInt();
        
        System.out.print("Bilangan Akhir : ");
        akhir_bilangan = sc.nextInt();
        
        for (int a = awal_bilangan; a <= akhir_bilangan; a++) {
            System.out.print(a + " ");
        }
    }
    
}
