import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bedaa on 29/03/2017.
 */
public class MainClass {

    public static void main(String[] args) throws IOException{
        RouletteKiller killer = new RouletteKiller();
        final PrintWriter out1 = new PrintWriter("result1.csv");
        final PrintWriter out2 = new PrintWriter("result2.csv");
        for (int n = 1 ; n < 50000; n++) {
            out1.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out1.close();

        for (int n = 50000 ; n < 100000; n++) {
            out2.write(n + ";" + killer.RouletteKiller1(n) + "\n");
        }

        out2.close();
    }
}
