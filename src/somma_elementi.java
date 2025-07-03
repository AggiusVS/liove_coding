public class somma_elementi {
    public static void main(String[] args) {
        int[] numeri = {3, 8, 66, 95,23, 73,5};
        int somma = 0;

        for (int i = 0; i < numeri.length; i++) {
            somma = somma + numeri[i];
        }
        System.out.println(somma);
    }
}
