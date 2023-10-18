import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita z przedzialu od 1 do 15");
        int liczba = klawiatura.nextInt();
        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < liczba; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}
