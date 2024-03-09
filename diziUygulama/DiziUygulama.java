package diziUygulama;

public class DiziUygulama {
    public static void main(String[] args) {
        char [] [] tablo = new char[8][8];

        for( int i=0; i<tablo.length;i++) {

            for (int a = 0; a < tablo[i].length; a++) {
                if(a==0){
                    tablo[i][a]='*';
                }
                else{
                    tablo[i][a]='-';
                }


            }
        }
        for( int i=0; i<tablo.length;i++) {

            for (int a = 0; a < tablo[i].length; a++) {
                System.out.print(tablo[i][a] +" ");
            }
            System.out.println();
        }

    }
}
