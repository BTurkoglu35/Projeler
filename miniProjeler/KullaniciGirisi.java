package miniProjeler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
         String kulIsmi="Asude Turkoglu";
         String kulSifre="canimoyuncaklar";
         int girisHakki=3;

        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("lutfen kullanici adi giriniz");
            String isimGiris = scan.nextLine();
            System.out.println("lutfen sifre girininiz");
            String sifreGiris = scan.nextLine();

            if (kulIsmi.equals(isimGiris) && kulSifre.equals(sifreGiris)) {
                System.out.println("giris basarili");
                break;
            } else if (kulIsmi.equals(isimGiris) && !kulSifre.equals(sifreGiris)) {
                System.out.println("sifre hatali tekrar deneyin");

            } else if (!kulIsmi.equals(isimGiris) && kulSifre.equals(sifreGiris)) {
                System.out.println("kullanici ismi hatali tekrar deneyin");

            } else{
                System.out.println("kullanici ismi ve sifre  hatali tekrar deneyin");}
            girisHakki--;
            System.out.println(girisHakki+ "  hakkiniz kalmistir");



            if(girisHakki==0) {
                System.out.println("giris hakkiniz bitmistir ,mustreri hizmtlleri ile gorusunuz");
                break;
            }

            }
        }

    }

