import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class zad13 {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            System.out.print("Podaj nazwę pliku: ");
            String nazwaPliku = System.console().readLine();

            reader = new BufferedReader(new FileReader(nazwaPliku));

            String linia;
            int liczbaLinii = 0;
            while ((linia = reader.readLine()) != null && liczbaLinii < 5) {
                System.out.println(linia);
                liczbaLinii++;
            }

        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Błąd zamknięcia pliku: " + e.getMessage());
            }
        }
    }
}
