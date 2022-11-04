package day03;

import java.util.Scanner;

public class DogumGunuKiyaslama2 {

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

        int ahmetDogumu = yil1 * 10000 + ay1 * 100 + gun1;
        int ayseDogumu = yil2 * 10000 + ay2 * 100 + gun2;

        if (ahmetDogumu>ayseDogumu) {
            System.out.println("Ayse Ahmetten Buyuktur.");
        } else if (ayseDogumu>ahmetDogumu) {
            System.out.println("Ahmet Ayseden buyuktur.");
        }else System.out.println("Ayni Gun Dogdunuz.");
    }
}
