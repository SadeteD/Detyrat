package ict.kosovo.growth.Ora_5;

/*Te shkruhet aplikacioni i cili shfaq menute dhe menyren e perzgjedhjes se tyre,
pas perzgjedhjes te shfaqet mesazhi per menu-ne e perzgjedhur?
1 – File
2 – Edit
3 –View
4 – Help
5 - Tools
Tjeter – Per Exit*/
import java.util.Scanner;
public class MenuWithSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem gjith nje nga menyt: ");
        int menu=scan.nextInt();

        switch (menu){
            case 1:
                System.out.println("File");
                break;
            case 2:
                System.out.println("Edit");
                break;
            case 3:
                System.out.println("View");
                break;
            case 4:
                System.out.println("Help");
                break;
            case 5:
                System.out.println("Tools");
                break;
            default:
                System.out.println("Exit");
        }
    }
}
