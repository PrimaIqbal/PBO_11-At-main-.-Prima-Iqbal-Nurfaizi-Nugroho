/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appArrayList;

/**
 *
 * @author PRIMA IQBAL
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       appArrayList kelas  publik {
    ArrayList< String >  DATA  =  new  ArrayList<> ();
    
    void  Tambah_Data () {
        Pemindai tambahkan =  Pemindai baru  ( System . in);
        print( " Masukkan string data : " );
        DATA . tambahkan (Jumlah Harga: Tambahkan . nextLine ());
        print( " Daftar String dalam Daftar Array : "  +  DATA );
        tambahkan . baris berikutnya();
    }
    void  Mencari_Data () {
        Scanner carikan =  Pemindai baru  ( System . in);
        print( " String yang dicari   " );
        String mencari = carikan . baris berikutnya();
        if (pencarian biner( DATA ,mencari) >  - 1 ){
            print( " String "  + mencari +  " ada di index ke "  + binarySearch( DATA ,mencari) + " di dalam data. " );
        } lain {
            print( " String "  + mencari +  " tidak ada dalam data. " );
        }
        
    }
    void  Menghapus_Data () {
        Scanner Menghapus =  baru  pemindai ( Sistem . Di);
        print( " String yang mau dihapus : " );
        String menghapuskan = menghapus . baris berikutnya();
        if (pencarian biner( DATA ,menghapuskan) >  - 1 ){
            DATA . hapus(binarySearch( DATA ,menghapuskan));
            print( " String "  + menghapuskan +  " sudah dihapus di dalam data. " );
        } lain {
            print( " String "  + menghapuskan +  " tidak ada dalam data. " );
        }
        
    }
    
    kekosongan  Menampilkan_Data () {
        Sistem . keluar . println( " Daftar string dalam daftar array : "  +  DATA );
    }
    static  void  print ( String  teks ) {
        Sistem . keluar . println(teks); 
    }
    
}
