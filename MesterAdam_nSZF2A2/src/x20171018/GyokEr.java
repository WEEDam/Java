package x20171018;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mester Ádám
 */
public class GyokEr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot: ");
        
        try {
            double szam = sc.nextInt();
            double gyok = Math.sqrt(szam);
            if (Double.isNaN(gyok)) {
                throw new Exception();
            }
            System.out.println("A szám négyzetgyöke: " + gyok);
        } catch (InputMismatchException ime) {
            System.err.println("Csak számból lehet négyzetgyököt vonni!");
        } catch (Exception e) {
            System.err.println("Negatív számból nem lehet négyzetgyököt vonni!");
        }

    }
}
