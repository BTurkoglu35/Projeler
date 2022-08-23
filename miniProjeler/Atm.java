package miniProjeler;

import java.util.Scanner;

public class Atm {
      /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.

        İşlemler
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q

        */
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          int bakiye =1000;
          System.out.println("***Atm'ye Hosgeldiniz");
          System.out.println("bakiye ogrenmek icin 1 \n para cekme icin 2 \n para yatirma icin 3 \n" +
                  "cikis icin q \n devam etmek icin \n tuslayiniz");
          String tercih=scan.next();

          while (true) {
              if (tercih.equals("1")){
                  System.out.println(" mevcut bakiyeniz  "+bakiye);
                  break;

              }else if (tercih.equals("2")){
                  System.out.println("cekmek istediginiz miktari giriniz");
                  int cekilecekMik=scan.nextInt();
                  if (cekilecekMik<bakiye) {
                      bakiye-=cekilecekMik;
                      System.out.println("isleminiz gerceeklestiriliyor\n" +
                              "guncel bakiyeniz "+bakiye);
                  }else System.out.println("bakiyeniz yetersiz");
                  break;


              }else if(tercih.equals("3")){
                  System.out.println("yatirmak istediginizz miktari giriniz");
                  int yatirilan=scan.nextInt();
                  bakiye+=yatirilan;
                  System.out.println("guncel bakiyeniz "+bakiye);
                  break;

              } else if (tercih.equals("q")) {
                  System.out.println("cikis yapiliyor");
                  break;


              }else {
                  System.out.println("gecersiz islem");
                  break;

              }

          }

      }
}
