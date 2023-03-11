/**
 * File      : MPoligon.java				08/03/23
 * Penulis   : Naufal Dzaki Imtiyaz
 * Deskripsi : Driver class untuk poligon dan persegi panjang
 * 
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());

        System.out.println();

        Segitiga segitiga = new Segitiga(10,10,3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }
}
