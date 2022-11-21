/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demopackage;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class grimoire {
  String judul, pengarang;
  long hargaBuku;
  
  public grimoire(String judul, String pengarang, long hargaBuku) {
    this.judul = judul;
    this.pengarang = pengarang;
    this.hargaBuku = hargaBuku;
  }
  public void cetakBuku() {
    System.out.println("\nJudul     : " + judul);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Harga Buku: Rp " + hargaBuku);
    System.out.println();
  }
}
