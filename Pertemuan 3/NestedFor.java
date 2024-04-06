/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.latihan4;

public class NestedFor {
    public static void main (String args[]){
        int a, b;
        for (a = 1; a <= 5; a++){
            for (b = 1; b <= a; b++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
