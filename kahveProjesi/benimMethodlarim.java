package kahveProjesi;

import java.util.Scanner;

public class benimMethodlarim {
    static Scanner scan=new Scanner(System.in);

    static  String sut="";
    static int sekerSayisi;
    static String seker="";
    static String boyut="";
   static String kahveTercih;
    public static void hangiKahve() {
        System.out.println("*******HOSGELDINIZ***");
        System.out.println("hangi kahveyi isteriniz");
        System.out.println("Turk Kahvesi  \n FiltreKahve \nEspresso \n ");
        kahveTercih = scan.nextLine().toUpperCase();
        if (kahveTercih.equalsIgnoreCase("turk kahvesi")) {
            System.out.println("Türk kahvesi hazırlanıyor");
        } else if (kahveTercih.equalsIgnoreCase("filtre kahve")) {
            System.out.println("Filtre kahve hazırlanıyor. ");
        } else if (kahveTercih.equalsIgnoreCase("espresso")) {
            System.out.println("Espresso hazırlanıyor");
        } else System.out.println("hatali tercih girdiniz");

    }

    public  static void sut(){
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız");
        String sut=scan.next();
        if(sut.equalsIgnoreCase("evet")){
            System.out.println("sut ekleniyor");
        }else System.out.println("sut eklenmiyor");
    }

    public static void seker(){
        System.out.println("seker istermisiniz?(Evet veya Hayır olarak cevaplayınız");
        seker=scan.next();
        if(seker.equalsIgnoreCase("evet")){
            System.out.println("kac seker olsun");
            sekerSayisi=scan.nextInt();
            System.out.println(sekerSayisi +" seker ekleniyor");
        }else System.out.println("seker eklenmiyor");


    }

    public static void boyut(){
        scan.nextLine();
        System.out.println("Hangi boyutta olsun (Büyük boy - orta boy - küçük boy olarak giriniz)");
        boyut=scan.nextLine();
        if (boyut.equalsIgnoreCase("Büyük Boy")){
            System.out.println("kahveniz buyuk boy haziraniyor");
        } else if (boyut.equalsIgnoreCase("orta Boy")) {
            System.out.println("kahveniz orta boy hazirlaniyor");
        } else if (boyut.equalsIgnoreCase("kucuk Boy")) {
            System.out.println("kahveniz kucuk boy hazirlaniyor");

        }
    }
    public static void siparisim(){
        System.out.println(kahveTercih+" "+boyut+" hazirdir. Afiyet olsun");
    }











}
