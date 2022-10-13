/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

import java.util.Scanner;

/**
 
 * @author M.Daffa Surya
 */
public class LuasBangunDatar {
    
   private  int panjang,lebar,luas;
    
    void persegipanjang(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan panjang             : ");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar               : ");
        lebar = input.nextInt();
        
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang Adalah  : " + luas);
    }
    
    
}
