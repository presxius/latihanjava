/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.latihan3;
import java.util.*;

/**
 *
 * @author lenovo
 */
class LatScan4 {
    public static void main (String args[]){
        int kd;
        String nb;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan kode barang[1..3]:");
        kd=input.nextInt();
        
        nb = switch (kd) {
            case 1 -> "Alat olahraga";
            case 2 -> "Alat elektronik";
            case 3 -> "Alat-alat masak";
            default -> "Anda salah memasukan kode";
        };
        System.out.println("\nNama Barang: "+nb);
}
}