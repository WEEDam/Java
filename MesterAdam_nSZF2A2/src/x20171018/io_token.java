package x20171018;

/*
  @author Mester Ádám
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class io_token {

    public static void main(String[] args) {

        int sum = 0;
        int db2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több egész számot vesszővel elválasztva!");
        String sor = sc.nextLine(); // sor beolvasása

        // darabolás
        StringTokenizer st = new StringTokenizer(sor, " "); // elválasztójel a vessző!
        int db = st.countTokens(); //adatok (tokenek) száma
        while (st.hasMoreTokens()) {
            try {

                sum += Integer.parseInt(st.nextToken());
                db2++;

            } catch (NumberFormatException ne) {
                System.out.println(ne.getMessage().split(":")[1].trim().replace("\"",""));
            }
        }
        System.out.println("A beolvasott számok (" + db2 + " db) összege: " + sum);
    }
}
