package ict.kosovo.growth.Ora_5;
/*Te shkruhet program I cili pranon dy numra dhe operatorin (+,-,/,*,%) dhe I cili
varesisht nga operatori qe ka zgjedhur gjen rezultatin?

Te program me lart (2) te shtohet edhe validimi ne rast te pjestimit me zero?*/
import  java.util.Scanner;
public class Operatori {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem shtyp nje numer: ");
        int nr1=scan.nextInt();
        System.out.println("Ju lutem shtyp dhe nje numer tjeter: ");
        int nr2=scan.nextInt();
        System.out.println("Ju lutem shtyp nje operator: ");
        String operatori=scan.nextLine();

        if(operatori.equals("+")){
            System.out.println("Rezultati eshte :"+nr1+" + "+nr2+" = "+(nr1+nr2));
        }
        else  if(operatori.equals("-")){
            System.out.println("Rezultati eshte :"+nr1+" - "+nr2+" = "+(nr1-nr2));
        }
    }
}
