package ict.kosovo.growth.Ora_3;

/* Shkruani programin i cili kerkon menaxhon rezultatin e ndeshjeve
sportive(futboll, basketboll, volleyball, handball, etc)? Shembull:Ekipi vendas: Çekia
Ekipi musafir: Kosova
Numri i tifozëve: 11700
Fusha/Arena: Arena e humbjes
Sa gola ka shënuar Çekia: 1
Sa gola ka shënuar Kosova: 3
--------------------------------------------------------
Rezultati përfundimtar
Çekia – Kosova 1-3
Arena e Humbjes me gjithsej 11700 spektatorë prezent.*/
import  java.util.Scanner;
public class Detyra3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ekipi vendas:");
        String ekipiVendas=scan.nextLine();
        System.out.println("Ekipi musafir:");
        String ekipiMusafir=scan.nextLine();
        System.out.println("Numri i tifozeve: ");
        int nrTifozve=scan.nextInt();
        System.out.println("Fusha/Arena:");
        scan.nextLine();
        String fusha=scan.nextLine();
        System.out.println("Sa gola ka shenuar "+ekipiVendas+" : ");
        int golaNgaEkipiVendas=scan.nextInt();
        System.out.println("Sa gola ka shenuar "+ekipiMusafir+" : ");
        int golaNgaEkipiMusafir=scan.nextInt();
        System.out.println("Rezultati Perfundimtar: \n" +ekipiVendas+" - "+ekipiMusafir+" : "+golaNgaEkipiVendas+" - " +golaNgaEkipiMusafir+"\nArena e "+fusha+" me gjithsej "+nrTifozve+" spektatore prezent");


    }
}

