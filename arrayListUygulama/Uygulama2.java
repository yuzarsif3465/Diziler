package arrayListUygulama;
import java.util.ArrayList;

public class Uygulama2 {
    public static void main(String[] args) {

        ArrayList<String> kursOgrencileri = new ArrayList();
        ArrayList<String> ispOgrencileri = new ArrayList();
        ArrayList<String> ingOgrencileri = new ArrayList();

        ispOgrencileri.add("yusuf");
        ispOgrencileri.add("hamza");

        ingOgrencileri.add("ali");
        ingOgrencileri.add("harun");
        ingOgrencileri.add("faruk");
        ingOgrencileri.add("banu");

        kursOgrencileri.addAll(ispOgrencileri);
        kursOgrencileri.addAll(ingOgrencileri);

        System.out.println("Kurstaki bütün ogrenciler: ");
        for (String ogr : kursOgrencileri) {
            System.out.println(ogr);
        }
        System.out.println(" ");
        System.out.println("ing sınıfında ki ogrenciler: ");
        for (String ogr : ingOgrencileri) {
            System.out.println(ogr);
        }
        System.out.println(" ");
        System.out.println("isp sınıfında ki ogrenciler: ");
        for (String ogr : ispOgrencileri) {
            System.out.println(ogr);
        }
    }
}
