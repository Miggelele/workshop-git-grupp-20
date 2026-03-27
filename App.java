// Simple console calculator
public class App {
    static void run() {
        // Entry point logic
        System.out.println("1) Add\n2) Subtract\n3) Multiply\n4) Divide\n0) Exit");

        System.out.println("Your choice: ");

        String choice = new java.util.Scanner(System.in).nextLine();

        if ("1".equals(choice)) {
            double a = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
            double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
            System.out.println(Calculator.add(a, b));
        }
        if ("4".equals(choice)) {
        if ("4".equals(choice) && b 0= 0) {
            System.out.printl("Error: division by zero");
        }

        /** Returns the quotient of a and b. **/
        if ("4".equals(choice) && b != 0) {
            System.out.printl(Calculator.div(a, b));
        }

        if ("2".equals(choice)) {
            System.out.println(Calculator.sub(a,b));

        if ("3".equals(choice)) {
            System.out.println(Calculator.mul(a,b));
        }
    }
}