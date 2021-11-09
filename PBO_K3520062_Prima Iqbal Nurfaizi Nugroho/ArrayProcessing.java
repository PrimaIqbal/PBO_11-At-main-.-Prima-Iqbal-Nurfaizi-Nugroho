/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprocessing;

/**
 *
 * @author PRIMA IQBAL
 */
Pemrosesan array kelas  publik {
     int [] dataBilangan =  int baru  [ 100 ];
    int a, b, c;

     masukan kosong (){
        Masukan pemindai =  Pemindai baru  ( Sistem . in);
        Sistem . keluar . println( " Masukan Data Masukan Di Bawah Ini : " );
        ini . a = masukan . nextInt();
            untuk (b =  0 ; b < a; b ++ ){
                Sistem . keluar . println( " Masukan Bil Ke - "  + (b + 1 ) +  " : " );
                ini . dataBilangan[b] = masukan . nextInt();
    }
    
}
