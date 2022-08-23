package manavProjesi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class runner {


  static   List<String> urunler=new ArrayList<String>(List.of("domates","patates","biber","sogan","havuc","elma","muz","cilek","kavun","uzum","limon"));
  static  List<Double>fiyatlar=new ArrayList<Double>(List.of(20.10,30.20,30.50,20.30,30.10,50.20,100.90,60.10,40.30,20.70,10.50));

    public static List<String> sepetUrunler = new ArrayList<>();
    public static List<Double> sepetUrunMiktari = new ArrayList<>();
    public static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void urunleriListele() {

        System.out.println("  No     urun      fiyat");
        System.out.println("====    ======     ========");
        for (int i = 0; i < urunler.size(); i++) {
            for (int j = i; j < i + 1; j++) {
                System.out.println(i + "     " + urunler.get(i) + "     " + fiyatlar.get(j));
            }
        }

    }
    public static void sepetUyari(double urunMiktari,int urunNo){
        double tutar=0;
        tutar=fiyatlar.get(urunNo)*urunMiktari;
        System.out.println(tutar);
        if (tutar > 1000) {
            System.out.println("1000 tl'yi astiniz");
        }

    }
    public static void sepeteEkle(double urunMiktari, int urunNo) {

        System.out.println("Sepetinizdeki urunler");

        sepetUrunler.add(urunler.get(urunNo));
        sepetUrunMiktari.add(urunMiktari);
        sepetFiyatlar.add(fiyatlar.get(urunNo));

    }

    public static void sepetiYazdir(int urunNo,List<String> urunler, List<Double> fiyatlar, double urunMiktari) {
        double tutar=0;
        double kgToplam = 0;

                System.out.println("urunler \t urun Miktari\t fiyati\t toplam tutar");
        for (int i = 0; i <sepetUrunler.size() ; i++) {
           kgToplam+=sepetFiyatlar.get(i)*sepetUrunMiktari.get(i);
            System.out.println(sepetUrunler.get(i)+"     "+sepetFiyatlar.get(i)+"    "+sepetUrunMiktari.get(i));

            System.out.println("toplam tutar = "+kgToplam);
        }


            }



            public static void main(String[] args) {
                int tercih;
                String devam;
                int urunNo;
                double urunMiktari;
                do {
                    urunleriListele();
                    System.out.println("listedeki urun nosunua gore urun seciniz");
                    urunNo = scan.nextInt();
                    System.out.println("almak istediginiz miktari giriniz");
                    urunMiktari = scan.nextInt();
                    sepetUyari(urunMiktari, urunNo);
                    sepeteEkle(urunMiktari, urunNo);
                    sepetiYazdir(urunNo, urunler, fiyatlar, urunMiktari);

                    System.out.println("alisverise devam etmek isteseniz 1'e " +
                            "bitirmek isterseniz ikiye basiniz");
                    tercih = scan.nextInt();

                } while (tercih == 1);

                sepetiYazdir(urunNo, urunler, fiyatlar, urunMiktari);


            }  }







