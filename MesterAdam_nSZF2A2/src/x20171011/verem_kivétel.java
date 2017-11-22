package x20171011;

public class verem_kivétel {

    public static int msec = 2000;

    public static class Verem_Exception extends Exception {

        public Verem_Exception(String hibauzenet) {
            super(hibauzenet);
        }
    }

    public static void var(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        /*
        long t0, t1;
        t0 = System.currentTimeMillis();
        do {
            t1 = System.currentTimeMillis();
        } while (!((t1 - t0) > n));

        */
    }

    public static class verem {

        private final static int meret = 3;
        private int[] verem = new int[meret];
        private int mutato = 0;

        public void betesz(int i) throws Verem_Exception {
            if (mutato < meret) {
                verem[mutato] = i;
                mutato++;
            } else {
                throw new Verem_Exception("A verem megtelt!");
            }
        }

        public int kivesz() throws Verem_Exception {
            if (mutato == 0) {
                throw new Verem_Exception("A verem üres");
            }
            mutato--;
            int i = verem[mutato];
            System.out.println("A szám (" + i + ") a veremből kivéve!");
            return i;
        }
    }

    public static void main(String[] args) {
        verem v = new verem();
        try {
            v.betesz(21);
            v.betesz(52);
            v.betesz(77);
            var(msec);
            v.betesz(99);
        } catch (Verem_Exception e) {
            System.out.println("Hiba! " + e.getMessage());
        }
        try {
            v.kivesz();
            v.kivesz();
            v.kivesz();
            v.kivesz();
        } catch (Verem_Exception e) {
            System.out.println("Hiba! " + e.getMessage());
        }
    }
}
