import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1;
        double num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        entrada.close();
    }
}