package training;

import com.sun.source.tree.YieldTree;

import java.util.Scanner;

public class ExerciciosBasicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE OS VALORES A SEGUIR: ");
        int a= sc.nextInt();
        System.out.println("DIGITE  VALOR 2");
        int b = sc.nextInt();
        System.out.println("DIGITE  VALOR 3");
        int c = sc.nextInt();

        int hegher = max(a,b,c);
        showResult(hegher);

        sc.close();
    }
    public static int max(int x, int y , int z){
        int aux = 0;
        if (x>y && x>z){
            aux = x;
        }
        if (y>x && y>z){
            aux = y;
        }
        if (z>x && z>y){
            aux= z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = "+ value);

    }
}
