
import java.util.Scanner;


public class fattoriale {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero positivo, calcolerò il suo fattoriale");
        int numero = Scanner.nextInt();

        if (numero < 0) { 
            System.out.println("Spiacente non posso calcolare il fattoriale di un numero negativo");
        } else { 
            int fattoriale = 1;
            for (int i = 1; i <= numero; i++) {
                fattoriale = fattoriale * i;
            }
            System.out.println("Il fattoriale di " + numero + " è " + fattoriale);
        }


            
        }
    }

