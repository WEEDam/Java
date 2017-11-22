package x20171011;

import java.util.Scanner;

public class osztas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az osztandót: ");
        int osztando = sc.nextInt();
        System.out.println("Kérem az osztót: ");
        int oszto = sc.nextInt();

        boolean sikeres = false;
        double hanyados = 0.0;

        try {
            hanyados =  ((double)osztando / (double)oszto);
            System.out.println(osztando + " / " + oszto + " = " + hanyados);
            sikeres = true;
        } catch (ArithmeticException ae) {
            System.out.println("hiba: " + ae.getMessage());
        } finally {
            if (sikeres) {
                System.out.println("Az osztás lezajlott...");
            } else {
                System.out.println("Az osztás sikertelen!");
            }
        }
    }
}
