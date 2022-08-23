package miniProjeler;

import java.time.LocalDate;
import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {
           /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı

        */
        Scanner scan=new Scanner(System.in);
        double faizOrani=0.06;
        System.out.println("anaparanizin miktarini giriniz");
        double anaPara=scan.nextDouble();
        System.out.println("kac yil vadeli yatirimak istediginizi giriniz");
        int yil=scan.nextInt();

        for (int i = 1; i <=yil ; i++) {
            anaPara+=(anaPara*faizOrani);
            System.out.println(i+" yilin sonunda ana para miktari  "+anaPara);
        }







    }
}
