public class Atividade22 {
    public static void main(String[] args) {
        int tempoTotal = 4000;
        int hrs;
        int mins;
        int segs;

        mins = (int) (tempoTotal / 60);
        segs = tempoTotal % 60;
        hrs = (int) mins / 60;
        mins = mins % 60;

        System.out.println(hrs  + ":" + mins + ":" + segs);
    }
}
