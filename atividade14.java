package atividade14;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int num1,num2;
        System.out.println("Digite um número: ");
        num1 = valor.nextInt();
        System.out.println("Digite outro número: ");
        num2 = valor.nextInt();
        if (num1 > num2) {
            System.out.println("O primeiro número é o maior.");
        } 
        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        }
        else {
            System.out.println("O segundo número é o maior.");
        }
    }
}