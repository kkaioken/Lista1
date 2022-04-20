public class Atividade2 {
    public static void main(String[] args) {
        int ultimovalor;
        int resultado = 0;
        for (int i = 1; i <= 1000; i++) {
            ultimovalor = resultado;
            resultado += i;
            System.out.printf("\n" + ultimovalor + " + " + i + " = " + resultado);
        }
    }
}