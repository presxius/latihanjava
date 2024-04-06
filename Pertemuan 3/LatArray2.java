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
public class LatArray2 {
    public static void main (String args[]){
        int i, j;
        int [][] dataJual;
        dataJual = new int [3][3];
        Scanner input = new Scanner (System.in);
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Masukkan data jual ke-["+i+"]["+j+"] =");
                dataJual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n\nData jual yang di-input ke elemen array \n");
            for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                System.out.println("Nilai data jual ["+i+"]["+j+"]");
                System.out.println(" = " + dataJual[i][j]);
            }
        System.out.println("");
            }
    }
}
