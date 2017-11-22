package x20171025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class vissza {
    public static void main(String[] args) {
        File theFile= new File("src/vissza.txt");
        try{
        Scanner eyes= new Scanner(theFile);
            while(eyes.hasNextLine()){
                String sor =eyes.nextLine();
                System.out.println(sor);
                String visszafele = new StringBuilder(sor).reverse().toString();
                System.out.println(visszafele);
            }
            eyes.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("Error: "+fnfe.getMessage());
//        }catch(IOException ioe){
//            System.out.println("Error: "+ioe.getMessage());
        }
        
    }
}
