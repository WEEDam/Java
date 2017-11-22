package x20171004;

import java.io.*;

public class fileWrite {
    public static void main(String[] args)throws Exception {
        try {
            FileWriter theFile = new FileWriter("src/x20171004/valami.txt");
            BufferedWriter write= new BufferedWriter(theFile);
            
            for (int i = 0; i <= 90; i++) {
                write.write(Integer.toString(i));
                write.newLine();
            }
            write.close();
        } catch (Exception e) {
            System.out.println("I/O hiba:"+e.getMessage());
        }
    }
}
