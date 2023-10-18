import java.util.Random;

public class zad21 {

    public static void main(String[] args) {
        int komp = 0;
        int uzyt = 0;
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            int rzutkomp= generator.nextInt(6) + 1;
            int rzutuzyt= generator.nextInt(6) + 1;
            System.out.println("Rzut komputera: " + rzutkomp);
            System.out.println("Rzut użytkownika: " + rzutkomp);
            if (rzutkomp > rzutuzyt){
                System.out.println("Wygrał komputer!\n");
                komp++;
            } else if (rzutuzyt > rzutkomp) {
                System.out.println("Wygrał użytkownik!\n");
                uzyt++;
            } else {
                System.out.println("Remis!\n");
            }
        }
        System.out.println("Wyniki końcowe:");
        System.out.println("Wygrane komputera: " + komp);
        System.out.println("Wygrane użytkownika: " + uzyt);
        if (komp > uzyt) {
            System.out.println("Wygrał komputer!");
        } else if (uzyt > komp) {
            System.out.println("Wygral uzytkownik!");
        } else {
            System.out.println("Gra zakończyła się remisem!");
        }
    }
}