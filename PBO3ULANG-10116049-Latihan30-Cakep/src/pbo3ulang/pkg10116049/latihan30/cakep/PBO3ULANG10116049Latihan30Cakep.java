package pbo3ulang.pkg10116049.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Validasi  
 */
public class PBO3ULANG10116049Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner baca = new Scanner (System.in);
        
        System.out.println((char)27+ "[01;35mKamu " + (char)27 
                + "[01;32mngerjain sendiri" + (char)27 +
                "[01;33m latihan 17 sampe" + (char)27 +
                "[01;34m latihan 30 ini?");
        
        System.out.print((char)27+ "[01;34mJawab " + (char)27 
                + "[01;35m(Yoi/Enggak) : ");
    
        String Keterangan = baca.next();
        
        System.out.println("");
        if("Yoi".equals(Keterangan) || ("yoi".equals(Keterangan)))  {
            System.out.println((char)27+ "[01;31mCakep Bener, " + (char)27 
                + "[01;35mGoodJoob : ");
            
        }
        if("Enggak".equals(Keterangan) || ("ENGGAK".equals(Keterangan))) {
        {    
            System.out.println((char)27+"[01;31mTetep Cakep Sih");
            System.out.println((char)27+"[01;36mSing Penting Paham "
                    + "Konsep nya yee.");
            System.out.println("Keep the code works dude");
            
        }           
    }
    
   
   }
    
 }
