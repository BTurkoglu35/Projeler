package src._11_dateTime.HaftaninSorusu;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.Scanner;

public class User  {


        String isim;

        LocalDateTime kayitZamani;


    public User(String isim, LocalDateTime kayitZamani) {
        this.isim = isim;
        this.kayitZamani = kayitZamani;
    }


}
