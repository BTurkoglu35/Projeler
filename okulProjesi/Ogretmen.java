package okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenler = new HashMap<String, String>();

    public static void feykOgretmenEkle() {
        ogretmenler.put("12245511588888", "Ali,Can,1980,Matematik");
        ogretmenler.put("12245511588889", "Veli,Yan,1981,Fizik");
        ogretmenler.put("12245511588887", "Ayse,Can,1982,Kimya");
        ogretmenler.put("12245511588886", "Ali,San,1983,Kimya");
        ogretmenler.put("12245511588885", "Alp,San,1984,Matematik");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("==========YILDIZ KOLEJI==========\n" +
                    "============OGRETMEN MENU=============\n" +
                    "\n" +
                    "\t 1-)Ogretmenler Listesi Yazdir\n" +
                    "\t 2-) Soyisimden Ogretmen Ya zdirma \n" +
                    "\t 3-) Branstan Ogretmen Bulma\n" +
                    "\t 4-) Bilgileri Girerek Ogretmen Ekleme\n" +
                    "\t 5-) Kimlik No Ile Kayit Silme\n" +
                    "\t A-) ANAMENU\n" +
                    "\t Q-) CIKIS\n");
            System.out.println("lutfen menuden tercihinizi yapiniz");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2"://soyisimden ogretmen bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3"://branstan ogretmen bulma
                    branstanOgretmenBulma();
                    break;
                case "4"://ogretmen ekleme
                    ogretmenEkleme();
                    break;
                case "5"://ogretmen silme
                    tcNoIleOgretmenSilme();
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":

                    break;
                default:
                    System.out.println("lutfen gecerli bir tercih yapiniz");

            }


        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();


    }

    private static void tcNoIleOgretmenSilme() {
        System.out.println("silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen= scan.nextLine();

        String silinecekValue=ogretmenler.get(silinecekOgretmen);
        String sonucValue= ogretmenler.remove(silinecekOgretmen);
        try {
            boolean sonuc= sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("verilen kimlik no ile ilgili ogretmen bulunamadi");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("TcNo");
        String tcNo=scan.nextLine();
        System.out.println("isim");
        String isim= scan.nextLine();
        System.out.println("Soyisim");
        String soyIsim= scan.nextLine();
        System.out.println("dogum Yili");
        String dogumYili= scan.nextLine();
        System.out.println("brans");
        String brans= scan.nextLine();

        String eklenecekValue=isim+","+soyIsim+","+dogumYili+","+brans;
        ogretmenler.put(tcNo,eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.printf("Aradiginiz ogretmenin bransini giriniz");
        String istenenBrans=scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenSet= ogretmenler.entrySet();
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "============BRANS ILE OGRETMEN ARAMA=============\n"+
                "TcNo           isim    Soyisim  D.Yili  Brans"  );
        for (Map.Entry<String, String> each:ogretmenSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr=eachValue.split(",");
            if(istenenBrans.equalsIgnoreCase(eachValueArr[3])){
                System.out.printf("%11s %-6s  %-8s  %4s   %s \n" , eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3]);
            }
        }
        Thread.sleep(5000);

    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.printf("Aradiginiz ogretmenin soyismini giriniz");
        String istenenSoyisim=scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenSet= ogretmenler.entrySet();
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "============SOYISIM ILE OGRETMEN ARAMA=============\n"+
                "TcNo           isim    Soyisim  D.Yili  Brans"  );
        for (Map.Entry<String, String> each:ogretmenSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr=eachValue.split(",");
            if(istenenSoyisim.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%11s %-6s  %-8s  %4s   %s \n" , eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
     Set<Map.Entry<String, String>> ogretmenSet= ogretmenler.entrySet();
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "============OGRETMEN LISTESI=============\n"+
                 "TcNo           isim    Soyisim  D.Yili  Brans"  );
        for (Map.Entry<String, String> each:ogretmenSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
           String[] eachValueArr=eachValue.split(",");
            System.out.printf("%11s %-6s  %-8s  %4s   %s \n" , eachKey,eachValueArr[0],eachValueArr[1],
                    eachValueArr[2],eachValueArr[3]);
        }
        Thread.sleep(5000);
    }

}
