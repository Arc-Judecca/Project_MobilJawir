/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobiljava;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class Mobil {
    
    protected String NoPlat;
    protected String Merk;
    protected float Pajak;
    
    public Mobil(){
        
    }
    
    public void TampilInfo(){
        System.out.println("Nomor plat: " + NoPlat);
        System.out.println("Merk: " + Merk);
        System.out.println("Pajak: " + Pajak);
    }
}
