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
public class IfElseClass {
    public String nama, ket;
    public int nilaiAkhir;
    Scanner input = new Scanner (System.in);
    
    public void setInputData(){
        System.out.print("Masukan Nama Siswa:");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Akhir:");
        nilaiAkhir = input.nextInt();
    }
        public String getKeterangan (){
            if(nilaiAkhir > 70){
            //Jika true
            ket = "Lulus";
        }else{
            //Jika false
            ket = "Gagal";
            }
        return ket;
        }
    
}
