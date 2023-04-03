package Atividade21;
import java.util.Scanner;
public class Atividade21 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        String nome;
        int idade, press, sexo;
        do {
        System.out.print("Digite seu nome: ");
        nome = valor.next();
        System.out.print("Digite seu sexo (Digite 1 para masculino ou 2 para feminino): ");
        sexo = valor.nextInt();
        System.out.print("Digite sua idade: ");
        idade = valor.nextInt();
        if (sexo == 1 && idade >= 18 && idade<= 25) {
            System.out.println(nome +", você é homem, maior de idade e pode servir.");
        } else {
            System.out.println("Você não está apto para servir.");
        }
System.out.print("deseja continuar? (1-Não/2-Sim)");
press = valor.nextInt();

        } while(press != 1);
    }
}