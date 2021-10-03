package ict.kosovo.growth.Ora_5;

/*
3. Te shkruhet program per shkallezimin e pages sipas deshires,
 psh:0 – pa page0-80 social
 80-120 social+ ose pensioner
 120-180 –page minimale
 180-300 – page mesatare
 300-400 – page e mire
 400-600 – page mbi mesataren e mire
 600+ page e larte */

import java.util.Scanner;
public class Paga {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ju lutem shtypeni pagen: ");
        int paga=scan.nextInt();

        if(paga==0){
            System.out.println("Pa page");
        }
        else  if(paga > 0 && paga< 80){
            System.out.println("Social");
        }
        else if(paga > 80 && paga <120){
            System.out.println("Social+ ose Pensioner");
        }
        else if(paga > 120 && paga <180){
            System.out.println("Page minimale");
        }
        else if (paga > 180 && paga <300){
            System.out.println("Page mesatare");
        }
        else if(paga > 300 && paga < 400){
            System.out.println("Page e mire");
        }
        else  if (paga  > 400 && paga< 600 ){
            System.out.println("Page mbi mesatare");
        }
        else  if(paga >600){
            System.out.println("Page e larte");
        }
        else if(paga<0 ){
            System.out.println("Paga eshte dhene gabim");
        }
    }
}
