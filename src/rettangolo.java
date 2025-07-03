
import java.util.Scanner;

public class rettangolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisce il numero di righe");
        int righe = scanner.nextInt();

        System.out.println("Inserisci il numero di colonne");
        int colonne = scanner.nextInt();

        for (int i = 1; i <= righe; i++) {
            for (int j = 1; j <= colonne; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
