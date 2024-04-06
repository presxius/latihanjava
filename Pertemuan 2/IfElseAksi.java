/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIf;

/**
 *
 * @author lenovo
 */
public class IfElseAksi {
    public static void main (String args[]){
        //Objek baru dari kelas IfELseClass.java
        IfElseClass IfClass = new IfElseClass();
        
        IfClass.setInputData();
        IfClass.getKeterangan();
        System.out.println("Hasil Akhir");
        System.out.println("==========================================");
        System.out.println("Nama Siswa                  :"+IfClass.nama);
        System.out.println("Nilai Akhir                 :"+IfClass.nilaiAkhir);
        System.out.println("Keterangan                  :"+IfClass.getKeterangan());
        System.out.println("==========================================");
    }
    
}
