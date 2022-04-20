import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("EScreva um número para transformar em binário.");
        int i = leitor.nextInt();
        String binstr = Integer.toBinaryString(i);
        System.out.println(binstr);
        leitor.close();
    }
}