import java.util.Scanner;

public class Tabelinna {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        /* numero di partenza */
        System.out.println("Inserisci il numero della tabellina");
        int numeroIniziale = Scanner.nextInt();

        /* numero finale */
        System.out.println("Inserisci il numero finale della tabellina");
        int numeroFinale = Scanner.nextInt();

        
        for(int i = 0; i * numeroIniziale <= numeroFinale; i++) {

            /* numero x i = __*/
            System.out.println(numeroIniziale + "x" + i + "=" + (numeroIniziale* i));

        }

    }
}
