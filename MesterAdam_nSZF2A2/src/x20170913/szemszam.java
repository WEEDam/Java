package x20170913;

public class szemszam {

    public static void main(String[] args) {
        int osszeg = 0;
        String ev = "";

        System.out.println("Kérem adja meg a személyi számát: ");
        String beker = "";
        if (beker.length() > 11 || beker.length() < 11) {
            System.out.println("Érvénytelen személyi szám");
        } else {
            int utolso = Character.getNumericValue(beker.charAt(10));
            int elso = Character.getNumericValue(beker.charAt(0));

            for (int i = 1; i < 3; i++) {
                ev += Character.getNumericValue(beker.charAt(i));
            }
            int evosszeg = Integer.parseInt(ev);
            for (int i = 0; i < beker.length(); i++) {
                if (evosszeg < 97 && elso < 3 || evosszeg < 97 && elso > 4) {
                    osszeg += (i + 1) * Character.getNumericValue(beker.charAt(i));
                } else {
                    osszeg += (10 - i) * Character.getNumericValue(beker.charAt(i));
                }
            }
            if (osszeg % 11 == utolso) {
                System.out.println("Éervényes személyi szám.");
            } else {
                System.out.println("Érvénytelen személyi szám.");
            }
        }
    }
}
