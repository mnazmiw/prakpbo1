/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;

/**
 *
 * @author azmig
 */
public class hitung {
    /*Membuat atribut untuk menghitung kebutuhan keramik*/
    int butuh; /*Kebutuhan keramik*/
    int harga; /*Harga keramik merek ini per m2*/
    int isi; /*Isi keramik per box*/
    int p; /*Panjang keramik*/
    int l; /*Lebar keramik*/
    
    /*Instansiasi method untuk menghitung kebutuhan keramik*/
    void hitungButuh(){
        double butuhCm;
        double luas;
        double total;
        
        /*Mengkonversi kebutuhan dari m2 ke cm2*/
        butuhCm = butuh * 10000;
        
        /*Menghitung luas keramik per box dalam cm2*/
        luas = (this.p * this.l * this.isi);
        
        /*Menghitung total kebutuhan keramik*/
        total = butuhCm/luas;
        
        /*Output harga keramik (total dibulatkan ke atas karena tidak mungkin beli tidak satu box)*/
        System.out.println("Harga keramik: Rp"+Math.ceil(total)*this.harga);
    }
}
