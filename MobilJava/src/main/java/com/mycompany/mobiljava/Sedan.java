/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobiljava;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class Sedan extends Mobil implements InterfaceSedan{
    protected String FasilitasKemanan;
    protected int KapasitasCC;
    protected String FasilitasKenyamanan;
    protected float TotalPajak;
    
    public Sedan(){
        
    }
    
    @Override
    public float HitungPajakSedan(){
        TotalPajak = (float) (Pajak + (Pajak + (Pajak * KapasitasCC * 0.00005)));
        return TotalPajak;
    }
    
    @Override
    public void tampilInfo(){
        System.out.println("Info Mobil");
        TampilInfo();
    }
    
    @Override
    public void InfoSedan(){
        System.out.println("Fasilitas Keamanan: " + FasilitasKemanan);
        System.out.println("Fasilitas Kenyamanan: " + FasilitasKenyamanan);
        System.out.println("Kapasitas CC: " + KapasitasCC);
        System.out.println("Total Pajak: " + TotalPajak);
    }
}
