public class trova_minimo {
    public static void main(String[] args) {
        int[] numeri = { 2, 3, 4, 5, 257, 7, 8, 9, 170, 1};
        int minimo = numeri[0];

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
            
        }
        System.out.println("Il numero massimo dell'array è: " + minimo);
    }

}
