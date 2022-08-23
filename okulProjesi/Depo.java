package okulProjesi;

import java.util.Scanner;

public class Depo {

   static Scanner scan = new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {
        String tercih="";
      do{
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "============ANA MENU=============\n" +
                "\n" +
                "\t 1-)Okul Bilgileri Goruntule\n" +
                "\t 2-) Ogretmen Menu \n"+
                "\t 3-) ogrenci Menu\t\t\n"+
                "\t Q-) CIKIS\n");
        System.out.println("lutfen menuden tercihinizi yapiniz");
        tercih=scan.nextLine();
        switch (tercih) {
            case "1":// okul bilgileri
            okulBilgileriniYazdir();
            break;
            case "2"://ogretmen bilgileri
                Ogretmen.ogretmenMenu();// ogretmenMenu();
            break;
            case "3"://ogrenci bilgileri
                Ogrenci.ogrenciMenu();
            break;
            case "Q":
            case "q":
                break;
            default:
                System.out.println("lutfen gecerli bir tercih giriniz");//
        }

        }while (!tercih.equalsIgnoreCase("q"));

      Depo.projeDurdur();
    }




    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("==========YILDIZ KOLEJI==========\n"+
                "\t\t Adres :"+OkulBilgileri.adres+
                "\n\t\t Telefon :"+OkulBilgileri.telefon);
        Thread.sleep(5000);

    }

    public static void projeDurdur() {

        System.out.println("Okul projesinden ciktiniz");
        System.exit(0);
    }
}
