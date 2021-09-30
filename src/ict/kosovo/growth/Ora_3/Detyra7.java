package ict.kosovo.growth.Ora_3;

import java.util.Scanner;
public class Detyra7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sa1cent, sa2cent, sa5cent, sa10cent, sa20cent, sa50cent, sa1euro, sa2euro;
        System.out.print("Sa 1 cent: ");
        sa1cent = scan.nextInt();
        System.out.print("Sa 2 cent: ");
        sa2cent = scan.nextInt();/*%d - numra%s - string%b - boolean%f - float -> %.3 -> perdori vetem 3 vlera pas presjes dhjetorenese perdorim ndonje numer pas %5d -> i bjen rezervo 5 vlera per numra te plote*/
        System.out.print("Sa 5 cent: ");
        sa5cent= scan.nextInt();
        System.out.print("Sa 10 cent: ");
        sa10cent= scan.nextInt();
        System.out.print("Sa 20 cent: ");
        sa20cent= scan.nextInt();
        System.out.print("Sa 50 cent: ");
        sa50cent= scan.nextInt();
        System.out.print("Sa 1 euro: ");
        sa1euro= scan.nextInt();
        System.out.print("Sa 2 euro: ");
        sa2euro= scan.nextInt();

        System.out.println("-----------------------------------------");
        System.out.printf("Sa 1 centshe: %5d %10.2f EUR %n", sa1cent, sa1cent * 0.01);
        System.out.printf("Sa 2 centshe: %5d %10.2f EUR %n", sa2cent, sa2cent * 0.02);
        System.out.printf("Sa 5 centshe: %5d %10.2f EUR %n", sa5cent, sa5cent * 0.05);
        System.out.printf("Sa 10 centshe: %5d %10.2f EUR %n", sa10cent, sa10cent * 0.10);
        System.out.printf("Sa 20 centshe: %5d %10.2f EUR %n", sa20cent, sa20cent * 0.20);
        System.out.printf("Sa 50 centshe: %5d %10.2f EUR %n", sa50cent, sa50cent * 0.50);
        System.out.printf("Sa 1 euro: %5d %10.2f EUR %n", sa1euro, sa1euro * 1.00);
        System.out.printf("Sa 2 euro: %5d %10.2f EUR %n", sa2euro, sa2euro * 2.00);
        System.out.println("-----------------------------------------");
        System.out.printf("Totali: %22.2f EUR %n", (sa1cent * 0.01 + sa2cent * 0.02 + sa5cent * 0.05 + sa10cent * 0.10 + sa20cent * 0.20 + sa50cent * 0.50 + sa1euro * 1.00 + sa2euro * 2.00));
        System.out.println("-----------------------------------------");
    }
}
