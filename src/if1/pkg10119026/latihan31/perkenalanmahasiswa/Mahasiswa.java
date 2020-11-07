/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
   public String nim, nama;
   public void perkenalkanDiri(){
       System.out.println("Hello Everyone");
       System.out.println("My NIM is " +nim);
       System.out.println("My Name is " +nama);
       
   }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs.nim = "10119026";
        mhs.nama = "Muhammad Khatami";
        mhs.perkenalkanDiri();
        
        mhs1.nim = "10110270";
        mhs1.nama = "Indra Tiola";
        mhs1.perkenalkanDiri();
        
        mhs2.nim = "10110271";
        mhs2.nama = "Robi Tansil Ganefi";
        mhs2.perkenalkanDiri();
        
        mhs3.nim = "10110269";
        mhs3.nama = "Muhammad Nur Awaludin";
        mhs3.perkenalkanDiri();
        
    }
    
}
