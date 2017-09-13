import java.util.Scanner;

public class CheckPassFail {
    public static void main(String args[]){
        int mark;
        Scanner input = new Scanner(System.in);
        mark = input.nextInt();
        if( mark >= 50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("Done");
    }
}
