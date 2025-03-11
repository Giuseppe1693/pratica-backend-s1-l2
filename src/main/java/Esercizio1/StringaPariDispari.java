package Esercizio1;

public class StringaPariDispari {
    public static boolean stringaPariDispari(String str) {

        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(stringaPariDispari("test"));
        System.out.println(stringaPariDispari("java"));
        System.out.println(stringaPariDispari("ciao!"));
    }
}
