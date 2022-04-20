import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = leitor.nextInt();
        int soma = 0;


        while(num > 0) {
            soma += (num % 10);
        
            num /= 10;
        }
        System.out.println("A soma dos algarismos é: " + soma);
        leitor.close();
    }

}