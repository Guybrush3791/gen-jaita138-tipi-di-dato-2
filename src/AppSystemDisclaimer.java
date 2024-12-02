import java.util.Scanner;

public class AppSystemDisclaimer {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dammi un valore intero:");
        int userValue = sc.nextInt();
        sc.nextLine(); // Consumo il carattere di fine riga

        System.out.println("Hai inserito: " + userValue);

        System.out.println("Dammi un colore:");
        String colore = sc.nextLine();

        System.out.println("Hai inserito: " + colore);

        System.out.println("Dammi una canzone:");
        String canzone = sc.nextLine();

        System.out.println("Hai inserito: " + canzone);

        sc.close();
    }
}
