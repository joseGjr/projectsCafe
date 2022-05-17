package training;

import java.util.Scanner;

public class Motorist {
    public static void main(String[] args) {
        System.out.println("QUANTAS HORAS ?  ");
        Scanner sc =new Scanner(System.in);
        int hora = sc.nextInt() ;



        if (hora <= 11 ){
            System.out.println("bom dia");
        }
        else {
            if (hora >= 12){
                System.out.printf("boa tarde");
            }
            else{
                System.out.printf("boa noite");
            }
        }
    }

}
