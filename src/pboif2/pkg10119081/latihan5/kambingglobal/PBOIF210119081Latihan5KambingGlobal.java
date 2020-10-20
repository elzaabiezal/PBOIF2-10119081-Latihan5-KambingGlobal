/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan5.kambingglobal;

/**
 *
 * @author Elza Abiezal
 */
public class PBOIF210119081Latihan5KambingGlobal {
    //Variabel Jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan Jumlah Kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambahi " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PBOIF210119081Latihan5KambingGlobal kambingSusu = new PBOIF210119081Latihan5KambingGlobal();
      
      //menampilkan jumlah kambing yang ada saat program pertama x berjalan
      kambingSusu.getJumlahKambing();
      
      //menambah satu kambing
      kambingSusu.getJumlahKambing();
      
      //menampilkan jumlah kambing yang ada
      kambingSusu.tambahKambing();
      
      //menampilkan jumlah kambing yang ada
      kambingSusu.getJumlahKambing();
      
       
    }
    
}
