/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pangkat2 {
    
    private int angka;
    
    public int getAngka(){
        return angka;
    }
    
    public void setangka(int angka){
        this.angka=angka;
    }
    
    void akarpangkat2(){
         Scanner input = new Scanner (System.in);
         System.out.print("Masukkan angka: ");
         angka = input.nextInt();
         angka=angka*angka;
         
         System.out.println("Hasil dari akar pangkat 2 adalah: "+ angka);
             
    }
}
