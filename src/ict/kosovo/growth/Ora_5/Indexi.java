package ict.kosovo.growth.Ora_5;

/*Te shkruhet programi i cili kërkon prej përdoruesit nje tekst
b) Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin:
Shkruaj indeksin nga 0 deri me A (A- gjatësia e tekstit paraprak) për ta paraqitur tekstin nga
indeksi deri ne fund:
Pasi shfrytëzuesi shkruan atë numër të shfaqet pjesa e tekstit nga indeksi deri ne fund*/

import  java.util.Scanner;
public class Indexi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem shkruani nje tekst: ");
        String teksti=scan.nextLine();
        System.out.println("Ju lutem shkruani nje indeks nga 0 deri ne "+teksti.length()+" qe te shfaqet teksti");
        int nr=scan.nextInt();

        System.out.println("Teksti nga indeksi "+nr+" deri te indeksi "+teksti.length()+" eshte "+teksti.substring(nr));
    }
}
