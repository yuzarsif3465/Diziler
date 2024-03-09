package arrayListUygulama;
import java.util.ArrayList;
import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int aranan;

        ArrayList<Integer> Sayi= new ArrayList<>();

        Sayi.add(455);
        Sayi.add(843);
        Sayi.add(348);
        Sayi.add(264);

        System.out.print("aradığınız sayı: ");
        aranan= sc.nextInt();


        for (int i=0; i<Sayi.size();i++){
            if(Sayi.get(i)==aranan){
                System.out.println("aranan sonuç bulundu");
            }

        }

    }
}
