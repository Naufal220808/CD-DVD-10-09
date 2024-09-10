package Persewaan;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String choice = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner s = new Scanner(System.in);

        System.out.println("Ingin Membeli CD / DVD?");
        choice = s.nextLine();

        if (choice.equalsIgnoreCase("CD")) {
            cd.CDprint();
        } else if (choice.equalsIgnoreCase("DVD")) {
            dvd.DVDprint();
        }
        s.close();
    }
    
}
