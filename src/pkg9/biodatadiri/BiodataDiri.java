/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.biodatadiri;
/**
 *
 * @author Intan
 */
public class BiodataDiri {
    //deklarasi variabel instance
    String nama, NIS, tempatlahir, tanggallahir, jeniskelamin, alamat, motto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BiodataDiri biodata = new BiodataDiri();
        //Membuat Judul
        System.out.println("BIODATA DIRI"); //menampilkan judul pada output
        //inisialisasi variabel
        biodata.nama = "Intan Putri Setyowati";
        biodata.NIS = "6490/2753.065";
        biodata.tempatlahir = "Malang";
        biodata.tanggallahir = "22 Maret 2005";
        biodata.jeniskelamin = "Perempuan";
        biodata.alamat = "Jl. Lembayung VII, Bumiayu";
        biodata.motto = "Balas dendam terbaik adalah kesuksesan";
        //menampilkan hasil output
        System.out.println("Nama Lengkap     : "+biodata.nama);
        System.out.println("NIS              : "+biodata.NIS);
        System.out.println("Tempat Lahir     : "+biodata.tempatlahir);
        System.out.println("Tanggal Lahir    : "+biodata.tanggallahir);
        System.out.println("Jenis Kelamin    : "+biodata.jeniskelamin);
        System.out.println("Alamat di Malang : "+biodata.alamat);
        System.out.println("Motto Hidup      : "+biodata.motto);
    }   
}
