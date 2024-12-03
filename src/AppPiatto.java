import java.util.Scanner;

public class AppPiatto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Definisci il tuo piatto personalizzato!");

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Descrizione:");
        String descrizione = sc.nextLine();

        System.out.println("Prezzo:");
        double prezzo = sc.nextDouble();

        System.out.println("Disponibilita':");
        boolean disponibilita = sc.nextBoolean();

        System.out.println("Tipologia:");
        byte tipologia = sc.nextByte();
        sc.nextLine(); // Consumo il carattere di fine riga

        System.out.println("Allergeni:");
        String allergeni = sc.nextLine();

        System.out.println("Foto:");
        String foto = sc.nextLine();

        System.out.println("Calorie:");
        short calorie = sc.nextShort();
        sc.nextLine();

        System.out.println("Variazioni:");
        String variazioni = sc.nextLine();

        sc.close();

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        System.out.println("Ecco il tuo piatto:");

        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Disponibilita': " + disponibilita);
        System.out.println("Tipologia: " + tipologia);
        System.out.println("Allergeni: " + allergeni);
        System.out.println("Foto: " + foto);
        System.out.println("Calorie: " + calorie);
        System.out.println("Variazioni: " + variazioni);
    }
}
