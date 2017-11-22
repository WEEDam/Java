package x20171004;

import java.io.File;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) {
        File theFile= new File("src/x20171004/valami.txt");
        
        try{
        Scanner eyes= new Scanner(theFile);
            while(eyes.hasNextLine()){
                String sor =eyes.nextLine();
                System.out.println(sor);            
            }
            eyes.close();
        }catch(Exception e){
            System.out.println("nem jó");
        }
    }
}
