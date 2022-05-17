package training;

import java.util.Locale;
import java.util.Scanner;

public class TreineDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp = 's';
        do {
            System.out.println("digite a temperatura em ºc");
            double C = sc.nextDouble();
             double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
            System.out.print("DESEJA REPETIR (S/N)? ");
            resp = sc.next().charAt(0);
        }while (resp !='n');
        sc.close();
    }

}
