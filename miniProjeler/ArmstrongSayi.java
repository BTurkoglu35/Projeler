package miniProjeler;

import java.util.Scanner;

public class ArmstrongSayi {
    /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)

        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz ");
        int sayi = scan.nextInt();
        int basamak = 0;
        int basmakSayisi = 0;
        int sayininKatlari = 0;
        int temp=sayi;
        while (sayi > 0) {
           sayi/=10;
            basmakSayisi++;
        }
        sayi=temp;
     do {
         basamak=sayi%10;
         sayininKatlari+=Math.pow(basamak,basmakSayisi);
         sayi/=10;

     }while (sayi>0);
     if (temp==sayininKatlari){
         System.out.println("armstrong sayi");

     }else System.out.println("armstrong sayi degil");















    }
}