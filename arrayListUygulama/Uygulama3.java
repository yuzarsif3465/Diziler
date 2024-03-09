package arrayListUygulama;
import java.util.ArrayList;
import java.util.Scanner;

public class Uygulama3 {
    public static void main(String[] args) {

        String arama;
        ArrayList<String> sınıfListe = new ArrayList<String>();
        sınıfListe.add("yunus");
        sınıfListe.add("yusuf");
        sınıfListe.add("yahya");
        sınıfListe.add("abdullah");
        sınıfListe.add("mustafa");
        Scanner sc = new Scanner(System.in);
        System.out.print("aradığınız isim: ");
        arama = sc.next();

        boolean durum= sınıfListe.contains(arama);
        if(durum){
            System.out.println(sınıfListe.indexOf(arama)+1+". ogrenci ");
        }
        else{
            System.out.println("arama sonucu bulunamadı");
        }
    }
}

