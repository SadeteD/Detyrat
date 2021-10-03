package ict.kosovo.growth.Ora_5;
/*Te shkruhet program i cili varesisht pikeve ne provim gjen noten tuaj
 Nese piket jane nga 0-49 – nota 5
 Nese piket jane nga 50-59 – nota 6
 Nese piket jane nga 60-69 – nota 7
 Nese piket jane nga 70-79 – nota 8
 Nese piket jane nga 80-89 – nota 9
 Nese piket jane nga 90-100 – nota 10.
 Pike negative nuk duhet lejuar leje shkollen, dhe piket mbi 100+ he more gjeni (nuk
duhet lejuar)*/

import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem shtypeni piket nga provimi juaj");
        int piket=scan.nextInt();


         if(piket >0 && piket <49){
            System.out.println("Nota juaj eshte 5");
        }
        else if(piket >50 && piket <59){
            System.out.println("Nota juaj eshte 6");
        }
        else if(piket >60 && piket <69){
            System.out.println("Nota juaj eshte 7");
        }
        else if(piket >70 && piket <79){
            System.out.println("Nota juaj eshte 8");
        }
        else if(piket >80 && piket <89){
            System.out.println("Nota juaj eshte 9");
        }
        else if(piket >90 && piket <100){
            System.out.println("Nota juaj eshte 10");
        }
        else if(piket <0 || piket >100){
            System.out.println("Piket jane dhen gabim");
        }

    }
}
