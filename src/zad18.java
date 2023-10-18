import java.util.Random;
import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Random rand = new Random();
        int maxNumber = 10;
        int random = rand.nextInt(maxNumber) + 1;
        int liczba;
        int proby=0;
        while (true){
            System.out.println("Podaj liczbe");
            liczba = klawiatura.nextInt();
            proby++;
            if(liczba>random){
                System.out.println("Podana liczba jest za duza");
            }else if(liczba<random){
                System.out.println("Podana liczba jest za mala");
            }else{
                System.out.println("Gratulacje zgadles liczbe");
                System.out.println("Liczba prob: "+proby);
                break;
            }
        }
    }

}
