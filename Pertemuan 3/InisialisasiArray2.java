/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author lenovo
 */
public class InisialisasiArray2 {
    public static void main (String args[]){
        int i, j;
        int[][] nilaiAkhir = {{150, 159, 230},{100, 125, 150}, {210, 125, 156}};
        
        System.out.println("Data yang di-input ke elemen array \n");
        //menampilkan data dari elemen array
            for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.println("Nilai akhir indeks ["+i+"]{"+j+"] = ");
                System.out.println(" = " + nilaiAkhir[i][j]);
            }
            }
    }
    
}
