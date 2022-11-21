/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demopackage;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class paket extends grimoire implements interfaceCD {
    long hargaPaket;
    interfaceCD interfaceCD;

    public paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) {
      super(judul, pengarang, hargaBuku);
      interfaceCD = new cdChild(ukuran, hargaCD);
    }

    public void hitungHargaPaket() {
      hargaPaket = super.hargaBuku + getHargaCD();
    }

    public void cetakCD() {
      interfaceCD.cetakCD();
    }

    public long getHargaCD() {
      return (interfaceCD.getHargaCD());
    }

    public void cetakPaket() {
      super.cetakBuku();
      cetakCD();
      System.out.println("Harga paket Buku dan CD: Rp " + hargaPaket + "\n");
    }
}
