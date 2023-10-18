import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        System.out.print("Podaj miesięczny budżet (w złotych): ");
        int budzet = klawiatura.nextInt();

        int wyd_calosc = 0;
        int wyd;

        while (true) {
            System.out.print("Podaj wydatek (lub wpisz -1, aby zakończyć): ");
            wyd = klawiatura.nextInt();

            if (wyd == -1) {
                break;
            }

            wyd_calosc += wyd;
        }

        int wynik = budzet - wyd_calosc;

        System.out.println("Wydatki: " + wyd_calosc);
        System.out.println("Różnica między budżetem a wydatkami: " + wynik);
    }
}
