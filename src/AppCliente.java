import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppCliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Definisci il tuo cliente preferito!");

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Cognome:");
        String cognome = sc.nextLine();

        System.out.println("Data di nascita: [dd/MM/yyyy]");
        String dataNascitaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitaStr, formatter);

        System.out.println("Numero di telefono:");
        String nTelefono = sc.nextLine();

        System.out.println("Note:");
        String note = sc.nextLine();

        System.out.println("E-Mail:");
        String email = sc.nextLine();

        System.out.println("Password:");
        String password = sc.nextLine();

        System.out.println("Username:");
        String username = sc.nextLine();

        System.out.println("Data e ora di iscrizione: [dd/MM/yyyy HH:mm]");
        String dataTimeIscrizioneStr = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataTimeIscrizione = LocalDateTime.parse(dataTimeIscrizioneStr, dateTimeFormatter);

        sc.close();

        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("Ecco il tuo top-cliente:");

        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di nascita: " + dataNascita);
        System.out.println("Numero di telefono: " + nTelefono);
        System.out.println("Note: " + note);
        System.out.println("E-Mail: " + email);
        System.out.println("Password: " + password);
        System.out.println("Username: " + username);
        System.out.println("Data iscrizione: " + dataTimeIscrizione);
    }
}
