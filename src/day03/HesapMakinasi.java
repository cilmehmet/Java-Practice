package day03;

import java.util.Scanner;

public class HesapMakinasi {
    /*
    kullanidan alacaginiz iki sayiyi yine kullaniciya sectireceğiniz
    4 işlemden biriyle isleme koyup sonucunu yazdiriniz.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tam sayi giriniz.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("YAPMAK İSTEDİGİNİZ İSLEMİ SECİN" +
                "/n/t1. Toplama/n/t2. Cikarma/n/t3. Carpma/n/t4. bolme");

        int islem= scan.nextInt();

        if (islem==1)
            System.out.println("Girdiginiz sayilarin toplami = " + (sayi1 + sayi2));
        else if (islem==2)
            System.out.println("Girdiginiz sayilarin farki = " + (sayi1 - sayi2));
        else if (islem==3)
            System.out.println("Girdiginiz sayilarin carpani = " + (sayi1 * sayi2));
        else if (islem==4)
            System.out.println("Girdiginiz sayilarin boleni = " + (sayi1 / sayi2));
        else
            System.out.println("Hatali giris yaptiniz.");
    }
}
