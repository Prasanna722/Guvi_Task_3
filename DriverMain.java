import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get Employee details
        System.out.println("Enter Employee ID, Name, Monthly Salary:");
        int empId = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String empName = sc.nextLine();
        double salary = sc.nextDouble();
        Employee emp = new Employee(empId, empName, salary);
        emp.calcTax();

        // Get Product details
        System.out.println("\nEnter Product ID, Price, Quantity:");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product product = new Product(pid, price, quantity);
        product.calcTax();

        sc.close();
    }
}
