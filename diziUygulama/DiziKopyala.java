package diziUygulama;

public class DiziKopyala {


    public static void main(String[] args) {
        int [] dizi1= {5,23,4,66};
        int [] dizi2= new int[dizi1.length];

        System.arraycopy(dizi1,0,dizi2,0,dizi1.length);
        for (int i=0;i<dizi1.length;i++){
            System.out.println(dizi2[i]);
        }

        //uzun hali;-->
        /*for (int i=0;i<dizi1.length;i++){
            dizi2[i]=dizi1[i];
        }
        for (int i=0;i<dizi1.length;i++){
            System.out.println(dizi2[i]);
        }*/

    }
}
