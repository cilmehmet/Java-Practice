package day04;

import java.util.Arrays;

public class KelimeleriniHarflerineAyirma {
    /*
     * write a method which accepts a String as parameter
     * and prints the sum of the digits, present in the given string
     *
     * Parametre olarak bir String kabul eden ve verilen Stringde
     * bulunan rakamların toplamını yazdiran bir method yazın.
     *
     * Input : ade1r4d3
     * Output : 1+4+3 = 8
     *
     * Use Character.isDigit()
     *     Integer.valueOf()
     */

    public static void main(String[] args) {
        String name = "Mehmet";
        kelimeninHarfleriArrayi(name);
        kelimeninHarfleriArrayi("String");
    }
    public static void kelimeninHarfleriArrayi(String input){

        char[] output = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {

            output [i] = input.charAt(i);
        }
        System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(output));
    }
}
