public class inverti_array {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5,};

        /* 5, 4, 3, 2, 1 */

        for (int i = numeri.length - 1; i >= 0; i--) {
            System.out.print(numeri[i] + " ");
        }
    }
}
