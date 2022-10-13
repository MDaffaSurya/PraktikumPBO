/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_1;

/**
 *
 * @author USER
 */
public class Siswa {
    
    private String nama;
    private int nilai,usia = 0;
    private String kelas,jeniskl,alamat;
    
    public void isiData(){
        nama = "Steven";
        nilai = 90;
        kelas = "XI RPL B";
        jeniskl = "laki-laki";
        usia = 16;
        alamat = "surakarta";
                
        
    }
    
    public void cetak(){
        System.out.println("Nama           : " + nama);
        System.out.println("Nilai          : " + nilai);
        System.out.println("kelas          : " + kelas);
        System.out.println("Jenis Kelamin  : " + jeniskl);
        System.out.println("Usia           : " + usia);
        System.out.println("alamat         : " + alamat);
    }
}
