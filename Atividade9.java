import java.util.Scanner;

public class Atividade9 {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o binário q você quer converter.");
        String entrada = leitor.next();
        int potencia = 0;
        int decimal = 0;
        for (int i = entrada.length() - 1; i >= 0; i--) {
            decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
            potencia++;

        }
        System.out.println("O binário convertido em decimal é: " + decimal);
        leitor.close();
    }
}