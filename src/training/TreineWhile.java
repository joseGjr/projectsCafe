package training;

import java.util.Scanner;

public class TreineWhile {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("QUANTOS NUMEROS DESEJA SOMAR?  ");
      int N = sc.nextInt();
      int soma = 0;
      for (int i = 0; i <N; i ++){
          System.out.println("DIGITE O PROXIMO NUMERO:  ");
          int x = sc.nextInt();
          soma = soma +x;
      }
        System.out.println(soma);
      for (int j = 0; j<11; j++){
          System.out.println("contagem impressa"+ j);
      }


      sc.close();
    }
}
