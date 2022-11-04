package day04;

import java.util.Scanner;

public class DikUcgen {
    /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */

    public static void main(String[] args) {

        int[] kenerlar = new int[3];
        int kenarSayac =1;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println(kenarSayac++ + ". kenar uzunlugunu giriniz. : ");
            kenerlar[i] = scan.nextInt();
        }

        if (    Math.pow(kenerlar[0],2)+ Math.pow(kenerlar[1],2) == Math.pow(kenerlar[2],2) ||
                Math.pow(kenerlar[1],2)+ Math.pow(kenerlar[2],2) == Math.pow(kenerlar[0],2) ||
                Math.pow(kenerlar[2],2)+ Math.pow(kenerlar[0],2) == Math.pow(kenerlar[1],2)
        )
        System.out.println("Bu bir dik ucgendir.");
        else System.out.println("Bu bir dik ucgen degilir.");
    }
    public static int findLongestEdge(int[] kenarlar) {

        int max =kenarlar[0];

        if (kenarlar[1] > max) max = kenarlar[1];

        if (kenarlar[2] > max) max = kenarlar[2];

        return max;
}

}
