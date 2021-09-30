package ict.kosovo.growth.Ora_3;

/* Shkruaje këtë varg të urdhërave në Java:
1. Nje ndryshore parate_e_mija inicializohet me 12
2. parate_e_mija zvogëlohet për 5
3. parate_e_mija dyfishohet
4. parate_e_mija resetohet, rivendoset në 1
5. Vlera e ndryshores parate_e_mija i dërgohet në një println-mesazh objektit*/
import java.util.Scanner;
public class Detyra6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Shtyp nje numer:");
        int nr1=scan.nextInt();
        System.out.println("Shtyp nje numer tjeter:");
        int nr2=scan.nextInt();
        System.out.println(nr1+" + "+nr2+" = "+(nr1+nr2));
        System.out.println(nr1+" - "+nr2+" = "+(nr1-nr2));
        System.out.println(nr1+" * "+nr2+" = "+(nr1*nr2));
        System.out.println(nr1+" / "+nr2+" = "+(nr1/nr2));
        System.out.println(nr1+" % "+nr2+" = "+(nr1%nr2));
    }
}
