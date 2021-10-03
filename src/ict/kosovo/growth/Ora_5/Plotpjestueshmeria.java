package ict.kosovo.growth.Ora_5;
/*Te shkruhet program i cili pranon dy numra, dhe te gjendet se a jane teplotepjestueshem numri i pare me numrin e dyte.
 Nese eshte I plotpjestueshem teshkruhet mesazhi“nr1 eshte i plotepjestueshem me nr2” perndryshe“nr1 nuk eshteI plotpjestueshem me nr2”*/

import java.util.Scanner;
public class Plotpjestueshmeria {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem shtypeni nje numer: ");
        int nr1=scan.nextInt();
        System.out.println("Ju lutem shtypeni dhe nje numer tjeter: ");
        int nr2=scan.nextInt();

        if(nr1 % nr2 == 0){
            System.out.printf("%d eshte i plotpjestueshem me  %d  %n ", nr1, nr2);
        }
        else {
            System.out.printf("%d  nuk eshte i plotpjestueshem me  %d  %n ", nr1, nr2);
        }
    }
}
