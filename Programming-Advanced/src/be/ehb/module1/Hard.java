package be.ehb.module1;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een getal in :");
        int getal1 = scanner.nextInt();
        System.out.println("Geef een tweede getal in :");
        int getal2 = scanner.nextInt();
        int deler = getal1;
        if (getal1 < getal2) {
            deler = getal2;
        }
        while((getal1 %deler != 0) || (getal2 %deler != 0)) {
            deler--;
        }

        System.out.println("De grootste gemene deler is : "+deler);
    }
}
