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
public class LatIf {
    public static void main (String args[])
    {
    double totalbeli, potongan=0, jumbayar=0;
    Scanner input = new Scanner (System.in);
    
    System.out.print("Total Pembelian Rp. ");
    totalbeli = input.nextDouble();
        if (totalbeli >= 50000)
            potongan = 0.2 * totalbeli;
        System.out.println("Besar Potongan Rp. "+potongan);
        jumbayar = totalbeli - potongan;
        System.out.println("Jumlah Bayar Rp. "+jumbayar);
    }
}
