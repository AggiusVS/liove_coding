
import java.util.Scanner;

public class inverti_stringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un stringa");

        String parola = scanner.nextLine();
        
        String parolaInvertita = "";
        for (int i = parola.length() - 1; i >= 0; i--) {
            parolaInvertita = parolaInvertita + parola.charAt(i);
        }
        System.out.println(parolaInvertita);
    }
}
