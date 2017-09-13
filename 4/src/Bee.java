/**
 * Created by nesty on 8/23/2017.
 */
public class Bee extends Beetle {
    private int x = printInit( "Bee.k initialized");
    public Bee(){
        System.out.println("x = " + x);
        System.out.println("j = " + j);
    }
    private static int x3 =
            printInit("static Bee.x3 initialized");
}
