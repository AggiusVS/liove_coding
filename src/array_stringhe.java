public class array_stringhe {
    public static void main(String[] args) {
        String[] nomi =  {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};

        for (int i = 0; i < nomi.length; i++) {
            if(nomi[i].startsWith("A")) {
                System.out.println(nomi[i]);

            }
        }
    }
}
