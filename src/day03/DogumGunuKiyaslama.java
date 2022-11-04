package day03;

import java.util.Scanner;

public class DogumGunuKiyaslama {

    /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birinci Yil / Ay / Gun olarak karsilastirmak" +
                "ilk dogum gunu tarihini giriniz.");

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();

        System.out.println("ikinci Yil / Ay / Gun olarak karsilastirmak" +
                "ilk dogum gunu tarihini giriniz.");

        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();

        if (yil1>yil2) {
            System.out.println("Ayse Ahmetten Buyuktur.");
        } else if (yil2>yil1) {
            System.out.println("Ahmet Ayseden buyuktur.");
        }else {

            if (ay1<ay2) {
                System.out.println("Ayse Ahmetten Buyuktur.");
            } else if (ay2>ay1) {
                System.out.println("Ahmet Ayseden buyuktur.");
            }else {

                if (gun1>gun2) {
                    System.out.println("Ayse Ahmetten Buyuktur.");
                } else if (gun2>gun1) {
                    System.out.println("Ahmet Ayseden buyuktur.");
                }else System.out.println("Ayni Gun Dogdunuz.");
            }
        }
    }
}