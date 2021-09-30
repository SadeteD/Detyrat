package ict.kosovo.growth.Ora_3;
/* Shkruani programin i cili kerkon nga shfrytezuesi nje ekip sportiv dhe shfaq
ne ekran (afishohet ne konsolle) ate qe keni shkruar?
Zgjedhni ekipin tuaj te zemres: Barcelona.
Ju keni zgjedhur Real Madrid, na falni per kete sjellje te sistemit.*/

import java.util.Scanner;
public class Detyra2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Zgjedheni ekipin tuaj te zemres ");
        String ekipi= scan.nextLine();
        System.out.println("Ju keni zgjedhur "+ekipi);


    }
}