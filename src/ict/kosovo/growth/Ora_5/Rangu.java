package ict.kosovo.growth.Ora_5;
//Te shkruhet nje program I cili pranon nga -10000 deri ne 10000. Nese eshte
//shkruar brenda ketij rangu te shfaqet mesazhi“numri eshte ne rangun e dhene”
//perndryshe te shfaqet mesazhi“numri nuk eshte ne rangun e dhene”

import java.util.Scanner;
public class Rangu {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ju lutem shtypeni nje numer: ");
        int nr=scan.nextInt();

        if(nr > -10000 && nr < 10000 ){
            System.out.println("Numri eshte ne rangun e dhene");
        }
        else {
            System.out.println("Numri nuk eshte ne rangun e dhene");
        }
    }
}
