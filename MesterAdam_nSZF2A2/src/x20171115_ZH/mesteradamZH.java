package x20171115_ZH;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class mesteradamZH {

    public static void main(String[] args) {
        // első feladat
        File theFile = new File("src/x20171115_ZH/valaszok.txt");
        String[] valaszok = new String[500];
        int i = 0;
        try {
            Scanner eyes = new Scanner(theFile);
            while (eyes.hasNextLine()) {
                String sor = eyes.nextLine();
                valaszok[i] = sor;
                i++;
            }
            System.out.println("1. feladat: Az adatok beolvasása.");
            eyes.close();
        } catch (Exception e) {
            System.out.println("nem jó");
        }
        //masodik feladat
        int db = 0;
        for (int j = 1; j < valaszok.length; j++) {
            if (valaszok[j] != null) {
                db++;
            }
        }
        System.out.println("2. feladat: A vetélkedőn " + db + " versenyző vett részt.");
        // harmadik feladat
        String sor = valaszok[1];
        StringTokenizer st = new StringTokenizer(sor, " ");
        System.out.println("3. feladat: A versenyző azonosítója = " + st.nextToken());
        String valasz = st.nextToken();
        System.out.println(valasz + "   (A versenyző válasza)");
        // negyedik feladat
        System.out.println("4. feladat:");
        String helyes = valaszok[0];
        char[] jo = helyes.toCharArray();
        char[] proba = valasz.toCharArray();
        System.out.println(helyes + "   (a helyes megoldás)");
        String valaszai = "";
        for (int j = 0; j < jo.length; j++) {
            if (jo[j] == proba[j]) {
                valaszai += "+";
            } else {
                valaszai += " ";
            }
        }
        System.out.println(valaszai + "   (a versenyző helyes megoldásai)");
    }
}
