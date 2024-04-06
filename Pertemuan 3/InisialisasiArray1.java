/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author lenovo
 */
public class InisialisasiArray1 {
    public static void main (String args[]){
        int i;
        double [] nilaiAkhir = {56.5, 66.7, 87.6, 98.5, 78.9, 85.4};
        System.out.println("\nData yang di-input ke elemen array \n");
        //menampilkan data dari elemen array
        for (i=0; i<6; i++){
            System.out.println("Nilai akhir indeks" +i);
            System.out.println(" = " + nilaiAkhir[i]);
        }
    }   
}
