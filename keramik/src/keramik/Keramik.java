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
public class Keramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Instansiasi main method*/
        hitung kA = new hitung();
        kA.butuh = 100;
        kA.harga = 54000;
        kA.isi = 10;
        kA.p = 30;
        kA.l = 30;
        kA.hitungButuh();
        
        hitung kB = new hitung();
        kB.butuh = 100;
        kB.harga = 65000;
        kB.isi = 5;
        kB.p = 40;
        kB.l = 40;
        kB.hitungButuh();
        
        hitung kC = new hitung();
        kC.butuh = 100;
        kC.harga = 60000;
        kC.isi = 8;
        kC.p = 30;
        kC.l = 40;
        kC.hitungButuh();
    }
    
}
