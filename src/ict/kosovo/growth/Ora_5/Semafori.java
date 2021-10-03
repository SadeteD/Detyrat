package ict.kosovo.growth.Ora_5;

/*Te shkruhet program semafori i cili pranon nje numer: nese numri eshte 1 te
shfaqet mesazhi semafori I kuq, nese numri eshte 2 semafori eshte I verdhe,
nese numri eshte 3 semafori eshte I gjelbert, nese numri eshte 4 semafori eshte
duke blinkuar,  per numra tejere semafori nuk eshte I leshuar fare (mungon
rryma)*/

import java.util.Scanner;
public class Semafori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ju lutem shtyp nje numer");
        int numri=scan.nextInt();

        if(numri==1){
            System.out.println("Semafori  eshte i kuq");
        }
        else if(numri==2){
            System.out.println("Semafori eshte i verdhe");
        }
        else if(numri==3){
            System.out.println("Semafori eshte i gjelbert");
        }
        else  if(numri==4){
            System.out.println("Semafori eshte duke blinkuar");
        }
        else{
            System.out.println("Semafori nuk eshte i leshuar ");
        }
    }
}
