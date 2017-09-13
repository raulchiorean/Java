import java.util.Scanner;
public class TestEmployee {
    public static void main(String args[]) {
        System.out.println("Salary");
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        System.out.println("id");
        int id = in.nextInt();
        System.out.println("first name");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        System.out.println("last name");
        String lastName = scan.nextLine();
        Employee e1 = new Employee(id, firstName, lastName, salary);

        e1.setSalary(e1.raiseSalary(50));
        System.out.println(e1.toString());
    }
}
