
import java.util.Scanner;

public class triangolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero positivo");
        int numero = scanner.nextInt();

        if(numero < 0) { 
            System.out.println("Spiacente il numero inserito non è positivo");
        } else {

            for (int i = 1; i <= numero; i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
