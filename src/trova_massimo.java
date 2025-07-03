public class trova_massimo {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 257, 7, 8, 9, 170};
        int massimo = numeri[0];

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
            
        }
        System.out.println("Il numero massimo dell'array è: " + massimo);
    }
}
