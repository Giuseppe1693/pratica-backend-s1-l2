package Esercizio1;

public class AnnoBisestile {
    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(annoBisestile(2020));
        System.out.println(annoBisestile(2021));
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(1900));
    }
}
