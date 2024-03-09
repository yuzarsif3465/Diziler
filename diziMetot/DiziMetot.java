package diziMetot;

import java.util.Scanner;

public class DiziMetot {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        int diziBoyut;
        System.out.print("dizin kaç elemanlı olsun: ");
        diziBoyut=sc.nextInt();

        int [] sayilar =diziElemanAl(diziBoyut);
        diziElemanYazdır(sayilar);

    }

    public static void diziElemanYazdır(int [] a) {
        System.out.println("yeni dizi elemanları");
        for(int i=0; i<a.length;i++)
            System.out.println(a[i]);

    }

    public static int [] diziElemanAl(int boyut) {
        int [] sayilar = new int[boyut];
        for (int i = 0; i < sayilar.length; i++){
            System.out.print((i+1) +". sayi: ");
            sayilar[i]=sc.nextInt();
        }
        return sayilar;
    }
}
