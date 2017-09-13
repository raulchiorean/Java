
public class test {
    public static void main(String[] args){
        Monst[] drink = new Monst[3];
        drink[0] = new f1();
        drink[1] = new f2();
        drink[2] = new f3();
        for(int i = 0; i < 3; i++){
            drink[i].d();
        }
    }
}
