package Esercizio4;

import java.util.Scanner;

public class ContoAllaRovescia {
    public static void main(String[] args) {
        // Crea uno scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire un numero intero
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        // Ciclo for per stampare il conto alla rovescia
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        // Chiudi lo scanner
        scanner.close();
    }
}
