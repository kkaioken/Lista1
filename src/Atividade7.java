public class Atividade7 {
    public static void main(String[] args) {
        int i = 10;
        int x = 15;
        
        System.out.println("O valor de i é: " + i);
        System.out.println("O valor de x é: " + x);

        int y = i;
        i = x;
        x = y;
        System.out.println("O valor trocado de i é: " + i);
        System.out.println("O valor trocado de x é: " + x);
    
    }
}