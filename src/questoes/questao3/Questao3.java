package questoes.questao3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
       String p1 = "ovo";
       String p2 = "ifailuhkqq";


        Scanner num = new Scanner(System.in);

        System.out.println("Digite a posição 1: ");
        int num1 = num.nextInt();


        System.out.println("Digite a posição 2: ");
        int num2 = num.nextInt();


        System.out.println("Substring 1: "+p1.substring(num1,num2));

        System.out.println("Digite a posição 1: ");
        int num3 = num.nextInt();


        System.out.println("Digite a posição 2: ");
        int num4 = num.nextInt();


        System.out.println("Substring 2: "+p2.substring(num3,num4));

    }
}
