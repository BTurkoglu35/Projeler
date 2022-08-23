package okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {
    static Map<String, String> ogrenciMap=new HashMap<>();
    static Scanner scan=new Scanner(System.in);
    public static void feykOgrenciEkle() {
       ogrenciMap.put("12245511588888", "Ali,Can,2010,3210,4,A");
       ogrenciMap.put("12245511588889", "Veli,Yan,2010,3200,4,B");
       ogrenciMap.put("12245511588887", "Ayse,Can,2011,3687,3,A");
       ogrenciMap.put("12245511588886", "Ali,San,2009,3654,5,B");
       ogrenciMap.put("12245511588885", "Alp,San,2009,3410,5,A");
    }

    public static void ogrenciMenu() throws InterruptedException {
        String tercih="";
        do {

            System.out.println("==========YILDIZ KOLEJI==========\n" +
                    "============OGRENCI MENU=============\n" +
                    "\n" +
                    "\t 1-)Ogrenci Listesi Yazdir\n" +
                    "\t 2-) Soyisimden ogrenci  Bulma\n" +
                    "\t 3-) Sinif ve Sube  ile Ogrenci Bulma\n" +
                    "\t 4-) Bilgileri Girerek Ogrenci Ekleme\n" +
                    "\t 5-) Kimlik No Ile Kayit Silme\n" +
                    "\t A-) ANAMENU\n" +
                    "\t Q-) CIKIS\n");

            System.out.println("lutfen menuden tercihinizi yapiniz");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                 ogrenciListesiYazdir();
                    break;
                case "2"://soyisimden ogrenci bulma
                     soyisimdenOgrenciBulma();
                    break;
                case "3"://branstan ogretmen bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4"://ogrenci ekleme
                       ogrenciEkleme();
                    break;
                case "5"://ogrenci silme
                    tcNoIleogrenciSilme();
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

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();




}

    private static void tcNoIleogrenciSilme() {
        System.out.println("silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);
        String sonucValue = ogrenciMap.remove(silinecekOgrenci);
        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("verilen kimlik no ile ilgili ogretmen bulunamadi");
        }
    }

    private static void ogrenciEkleme() {
        System.out.println("TcNo giriniz");
        String TcNo =scan.nextLine();
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println("dogum yili giriniz");
        String dYili=scan.nextLine();
        System.out.println("okul no giriniz");
        String okulNo=scan.nextLine();
        System.out.println("sinif girinz");
        String sinif=scan.nextLine();
        System.out.println("sube giriniz");
        String sube=scan.nextLine();
        String key=TcNo;
        String eklenecekValue=isim+","+soyisim+","+dYili+","+okulNo+","+sinif+","+sube;
       ogrenciMap.put(key,eklenecekValue);





    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String, String>> ogrenciSet= ogrenciMap.entrySet();
        System.out.println("istenilen ogrencinin sinifini yaziniz");
        String sinif=scan.next();
        System.out.println("istenilen ogrencinin subesini giriniz");
        String sube=scan.next();
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "============SOYISIM ILE OGRETMEN ARAMA=============\n"+
                "TcNo           isim    Soyisim  D.Yili OkulNo Sinif  Sube" );
        for (Map.Entry<String, String> each:ogrenciSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr=eachValue.split(",");
            if(sinif.equalsIgnoreCase(eachValueArr[4])&&sube.equalsIgnoreCase(eachValueArr[5])){
                System.out.printf("%11s %-6s  %-8s  %4s   %4s   %2s   %2s \n" , eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3],eachValueArr[4], eachValueArr[5]);
            }
        }
        Thread.sleep(5000);
    }







    public static void soyisimdenOgrenciBulma() throws InterruptedException {
        System.out.printf("Aradiginiz ogrencinin soyismini giriniz");
        String istenenSoyisim=scan.nextLine();
        Set<Map.Entry<String, String>> ogrenciSet= ogrenciMap.entrySet();
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "============SOYISIM ILE OGRETMEN ARAMA=============\n"+
                "TcNo           isim    Soyisim  D.Yili OkulNo Sinif  Sube"  );
        for (Map.Entry<String, String> each:ogrenciSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr=eachValue.split(",");
            if(istenenSoyisim.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%11s %-6s  %-8s  %4s   %4s   %2s   %2s  \n" , eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3],eachValueArr[4], eachValueArr[5]);
            }
        }
        Thread.sleep(5000);
}


        public static void ogrenciListesiYazdir() throws InterruptedException {
            Set<Map.Entry<String, String>> ogrenciSet= ogrenciMap.entrySet();
            System.out.println("==========YILDIZ KOLEJI==========\n" +
                    "============OGRENCI LISTESI=============\n"+
                    "TcNo           isim    Soyisim  D.Yili OkulNo Sinif  Sube"  );
            for (Map.Entry<String, String> each:ogrenciSet) {
                String eachKey = each.getKey();
                String eachValue = each.getValue();
                String[] eachValueArr=eachValue.split(",");
                System.out.printf("%11s %-6s  %-8s  %4s   %4s   %2s   %2s  \n" , eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3],eachValueArr[4], eachValueArr[5]);
            }
            Thread.sleep(5000);
        }






}

