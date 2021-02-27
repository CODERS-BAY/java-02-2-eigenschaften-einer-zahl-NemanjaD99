import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("gib eine Zahl aus:");
        int zahl=sc.nextInt();
        int gzahl=16;

        if( zahl % 1 == 0) { System.out.println("deine Zahl ist "+zahl+" ist eine Runde Zahl ");

            if (zahl==gzahl) {System.out.println("deine Zahl ist deine GlücksZahl");
                if ( zahl % 2 == 0 ) {System.out.println("Deine Zahl ist gerade und ist durch 2 Teilbar");}
                else if(zahl %2!=0) {System.out.println("Deine Zahl ist ungerade und ist nicht durch 2 Teilbar");}
            }else if (zahl!=gzahl) {System.out.println("deine Zahl ist nicht deine GlücksZahl");}


        }else if(zahl %1!=0) {System.out.println("deine Zahl ist "+zahl+" ist  keine Runde Zahl ");}





    }
}
