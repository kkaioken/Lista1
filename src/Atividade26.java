public class Atividade26 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) 
            System.out.println("Fatorial de " + i + ":" + fatorial( i ));

        } public static int fatorial(int n) {
            return n == 0 ? 1 : n * fatorial(n - 1);

        }
    }