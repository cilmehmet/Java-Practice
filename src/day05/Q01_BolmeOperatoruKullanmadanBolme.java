package day05;

import java.util.Scanner;

public class Q01_BolmeOperatoruKullanmadanBolme {

    static int bolum = 0;

    public static void main(String[] args) {

        //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz.");
        int bolunen = scan.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz.");
        int bolen = scan.nextInt();

        System.out.println(bolen + "/" + bolen + "=" + bol(bolunen , bolen));
    }

    public  static int bol(int bolunen, int bolen){


        while (bolunen>=bolen){
            bolunen-=bolen;

            bolum++;

        }
        return bolum;
    }
}
