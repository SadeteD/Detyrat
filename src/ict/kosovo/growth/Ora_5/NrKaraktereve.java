package ict.kosovo.growth.Ora_5;

/*Te shkruhet programi i cili kërkon prej përdoruesit nje tekst
a) Pasi shfrytëzuesi te shkruan tekstin atëherë programi shfaq ne program numrin e
karaktereve qe teksti përmban?*/
import java.util.Scanner;
public class NrKaraktereve {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ju lutem shkruani nje tekst: ");
        String teksti=scan.nextLine();

        System.out.println("Numri i karaktereve ne kete tekst eshte "+teksti.length());

    }
}
