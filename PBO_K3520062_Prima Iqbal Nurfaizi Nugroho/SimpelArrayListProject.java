/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpelArrayListProject;

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
      kelas  publik SimpleArrayListProject {

    /**
     * @param memperdebatkan argumen baris perintah
     */
    public  static  void  main ( String [] args ) {
        // logika aplikasi kode TODO di sini
     appArrayList app =  appArrayList baru ();
        sementara ( benar ){
            int masuk ;
            print( "Daftar Menu ArrayDaftar : " );
            print( " 1.Tambah data " );
            print( " Data 2.Cari " );
            print( " 3.Hapus Data " );
            print( " 4.Tampilkan Data " );
            print( " 5.Keluar " );
            
            Masukan pemindai =  Pemindai baru  ( Sistem . in);
            cetak( " " );
            print( " Pilih nomor yang diinginkan = " );
            inp = masukan . nextInt();

            saklar (inp) {
                kasus  1 :
                    aplikasi . tambah_Data ();
                    istirahat ;
                kasus  2 :
                    aplikasi . Mencari_Data ();
                    istirahat ;
                kasus  3 :
                    aplikasi . Menghapus_Data ();
                    istirahat ;
                kasus  4 :
                    aplikasi . aku_Data ();
                    istirahat ;
                kasus  5 :
                    print( " Selesai " );
                    Sistem . keluar( 0 );
                    default :
                    print( " Masukan Tidak Valid " );
            }           
        }
    }
    static  void  print ( String  teks ) {
    Sistem . keluar . println(teks);  
    }
    
}
