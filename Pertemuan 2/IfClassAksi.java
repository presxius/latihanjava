/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIf;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class IfClassAksi {
    public static void main (String args[]){
        double totalbeli;
        Scanner input = new Scanner (System.in);
        IfClass fungsiif=new IfClass();
        
        System.out.print("Total Pembelian Rp. ");
        fungsiif.totalbeli=input.nextDouble();
        
        System.out.println("Besar Potongan Rp. "+fungsiif.getpotongan());
        System.out.println("Jumlah Bayar Rp. "+fungsiif.jumlahbayar());
    }
    
}
