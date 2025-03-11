package Esercizio3;

import java.util.Scanner;

public class SuddividiStringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Inserisci una stringa (o ':q' per uscire): ");
            input = scanner.nextLine();

            if (":q".equals(input)) {
                System.out.println("Programma terminato.");
                break;
            }

            char[] caratteri = input.toCharArray();
            String risultato = String.join(", ", new String(caratteri, 0, caratteri.length).split(""));
            System.out.println(risultato);
        }

        scanner.close();
    }
}
