package x20170920;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class szemszamGen {

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int szemszam[] = new int[11];
        String[] szemszamok = new String[10];
        BufferedWriter bw= null;
        bw = new BufferedWriter(new FileWriter("C:\\Users\\Tanulo\\Desktop\\nSZF2A2_mesteradam\\src\\x20171004\\valami.txt", true));
        for (int i = 0; i < 10; i++) {
            int osszeg = 0;
            szemszam[0] = rand.nextInt(8) + 1;
            szemszam[1] = rand.nextInt(10);
            szemszam[2] = rand.nextInt(10);
            szemszam[3] = rand.nextInt(2);
            szemszam[4] = rand.nextInt(9) + 1;
            szemszam[5] = rand.nextInt(2)+1;
            szemszam[6] = rand.nextInt(8);
            szemszam[7] = rand.nextInt(10);
            szemszam[8] = rand.nextInt(10);
            szemszam[9] = rand.nextInt(10);
            
            if (szemszam[3] == 1) {
                szemszam[4] = rand.nextInt(2);
            }
            for (int y = 0; y < szemszam.length; y++) {
                osszeg += szemszam[y] * (y + 1);
            }
            szemszam[10] = osszeg % 11;
            if (szemszam[10] != 10) {
                for (int x = 0; x < szemszam.length; x++) {
                    szemszamok[i]+=szemszam[x];
                    System.out.print(szemszam[x]);                    
                }
                System.out.println("");
            }
        }
        for (int i = 0; i < szemszamok.length; i++) {
            if(szemszamok[i]!=null){
            
            bw.write(szemszamok[i] + "\r\n");
            bw.flush();
            }
        }
    }
}
