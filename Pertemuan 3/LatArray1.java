/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class LatArray1 {
    public static void main (String args[]){
        int i;
        int [] nilaiAkhir;
        //deklarasi variabel array
        nilaiAkhir = new int[6];
        Scanner input = new Scanner (System.in);
            for(i=0; i<6; i++){
                System.out.println("Masukkan array ke "+i+" = ");
                nilaiAkhir[i] = input.nextInt();
            }
            System.out.println("\n\nData yang di input ke elemen array \n");
                for(i=0; i<6; i++){
                    System.out.println("Nilai akhir indeks" +i);
                    System.out.println(" = "+nilaiAkhir[i]);
            }
    }
}
