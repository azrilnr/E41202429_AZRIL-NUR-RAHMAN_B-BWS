/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class TugasB {
 public static void main(String[] args) {
    System.out.println("TugasB");
    System.out.println();
    
    System.out.println("Masukkan Angka : ");
    Scanner scn = new Scanner(System.in);
    int jumlah = scn.nextInt();
    
    int[] ar = new int[jumlah];
    for (int i =0; i < ar.length; i++) {
        ar[i] = (int)(Math.random() * 100);
        System.out.print(ar[i] + "  ");
    }
    System.out.println();
 }
}
