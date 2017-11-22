package x20171108;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * @author Mester Ádám
 */
class tanulo implements Serializable {

    String nev;
    Integer kor;
}

public class serialization {

    private static void make() throws IOException {
        tanulo sanyi = new tanulo();
        sanyi.nev = "Rózsa Sándor";
        sanyi.kor = 160;

        tanulo mari = new tanulo();
        mari.nev = "Kiss Mária";
        mari.kor = 40;
        
        tanulo bela = new tanulo();
        bela.nev="Nagy Béla";
        bela.kor=20;

        FileOutputStream fos = new FileOutputStream("adat.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(sanyi);
        oos.writeObject(mari);
        oos.writeObject(bela);

        oos.close();
    }

    private static void load() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("adat.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        tanulo sanyi2= (tanulo) ois.readObject();
        tanulo mari2= (tanulo) ois.readObject();

        ois.close();
        
        System.out.println("adat1: "+sanyi2.nev);
        System.out.println("adat1: "+sanyi2.kor);
        
        System.out.println("adat2: "+mari2.nev);
        System.out.println("adat2: "+mari2.kor);
    }
    
    private static void load2() throws IOException, ClassNotFoundException {
    
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("adat.txt"));
            ){
 
            while (true) {
                tanulo student = (tanulo) ois.readObject();
 
                System.out.println(student.nev);
                System.out.println(student.kor);
                
            }
 
        } catch (EOFException eof) {
            System.out.println("Vége a fájlnak!");
            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }finally{
            
        }
    
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        make();
        //load();
        load2();
        
    }
}
