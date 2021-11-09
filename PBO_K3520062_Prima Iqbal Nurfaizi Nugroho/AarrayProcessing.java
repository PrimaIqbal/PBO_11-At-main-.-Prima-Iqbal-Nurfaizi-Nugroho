/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProcessing;

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
        Pemrosesan Array kelas  publik {
     int [] dataBil =  int baru  [ 100 ];
    int a,b,c;
    
     masukan kosong (){
        Masukan pemindai =  Pemindai baru  ( Sistem . in);
        Sistem . keluar . println( " Masukan Data yang Masuk : " );
        ini . a = masukan . nextInt();
            untuk (b =  0 ; b < a; b ++ ){
                Sistem . keluar . println( " Masukan bil ke - "  + (b + 1 ) +  " : " );
                ini . dataBil[b] = masukan . nextInt();
            }
    }
    double  hitungRerata ( int [] dataArray ){
        jumlah ganda =  0 ;
        untuk (b = 0 ;b < this . a;b ++ ){
            jumlah += dataArray[b];
        }
        double rerata = jumlah / ini . A;
        mengembalikan rerata;
    }
    int  cariMax ( int [] dataArray ){
        int maks = dataArray[ 0 ];
        untuk ( b = 0 ;b < this . a;b ++ ){
            if (maks < dataArray[b]){
                maks = dataArray[b];
            }
        }
        pengembalian maks;
    }
    int  cariMin ( int [] dataArray ){
        int min = dataArray[ 0 ];
        untuk (b = 0 ;b < this . a;b ++ ){
            if (min > dataArray[b]){
                min = dataArray[b];
            }
        }
        kembali min;
    }
   
    batalkan  keluaran (){
    Sistem . keluar . println ( " Rata-rata: "  +  ini . hitungRerata ( ini . dataBil));
    Sistem . keluar . println( " Nilai minimum : "  +  this . cariMin( this . dataBil));
    Sistem . keluar . println( " Nilai maksimum : "  +  this . cariMax( this . dataBil));
    }
    
}
