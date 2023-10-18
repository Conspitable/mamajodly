import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int[] sklep = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj wartość sprzedaży sklepu " + (i + 1));
            sklep[i] = klawiatura.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            int ilosc_gwiazdek = sklep[i] / 100;
            String gwiazdki = "*".repeat(ilosc_gwiazdek);
            System.out.println("Sklep " + (i + 1) + ": " + gwiazdki);
        }
    }
}