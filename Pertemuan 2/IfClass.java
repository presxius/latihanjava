/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIf;

/**
 *
 * @author lenovo
 */
public class IfClass {
    public double totalbeli,potongan;
    
    public void settotalbeli(double a){
        totalbeli = a;
    }
public double getpotongan(){
    if (totalbeli >= 50000);
    potongan = 0.2*totalbeli;
        return potongan;
}
public double jumlahbayar(){
    return (totalbeli-potongan);
}
}
