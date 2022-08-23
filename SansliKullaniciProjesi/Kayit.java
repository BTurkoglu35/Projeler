package src._11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<User>kisiler=new ArrayList<>();

    public List<User> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.next();
        User yeniKayit=new User(isim, LocalDateTime.now());

        kisiler.add(yeniKayit);
        return kisiler;
    }
    public void sansliKullanici(List<User>list){
        int sayac=0;
        for (User each:list){
            if(each.kayitZamani.getSecond()<10) {
                System.out.println("Sansli kisisin " + each.isim + " indirim ceki kazandiniz");
                sayac++;
            }
        }
     if(sayac==0){
         System.out.println("Sansli kullanici yok");
     }
}

    public void listele(List<User>list){
        for (User each:list){
            System.out.println("adi "+each.isim+" kayit zamani "+each.kayitZamani);
        }


    }







}


