package day02;

import javax.print.attribute.standard.DocumentName;
import java.util.Scanner;

public class Q2_Scanner_IfStatement {

    public static void main(String[] args) {

        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner scan = new Scanner(System.in);

        double vize,donemSonu,devam;

        System.out.print("Lutfen Vize Notunuzu Giriniz. ");
        vize =scan.nextDouble();
        System.out.print(" Lutfen DonemSonu Notunuzu Giriniz.");
        donemSonu = scan.nextDouble();
        System.out.print("Lutfen Devam Notunuzu Giriniz.");
        devam = scan.nextDouble();

        double ort = (vize*0.1) + (donemSonu*0.8) + (devam*0.1);

        if (ort> 100 || ort< 0){
            System.out.println("Yanlis Giris Yaptiniz.");
        } else if (ort >= 70) {
            System.out.println("Basarili Ögrenci.");
        } else if (ort>= 60) {
            System.out.println("Sartli Gectiniz.");

        }else
            System.out.println("Dersten Kalkdiniz.");
    }
}
