package com.company.latihan3;

import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class ClassScanner {
    public String nama;
    public double n1;
    public int n2,n3;
    Scanner input = new Scanner(System.in);
    
    public String getnama(){
        return nama;
    }
    
    public void inputScanner(){
        
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai 1 : ");
        n1 = input.nextDouble();
        System.out.print("Masukkan Nilai 2 : ");
        n2 = input.nextInt();
    }
    
    public double rata(){
        return ((n1+n2)/2);
    }
    
}
