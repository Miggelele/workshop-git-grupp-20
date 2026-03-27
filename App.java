// Simple console calculator
public class App {
    /** Starts interactive console flow. */
    static void start() {
        // Entry point logic

        System.out.println("1) Add\n2) Subtract\n3) Multiply\n4) Divide\n0) Exit program");

        System.out.println("Your choice: ");

        String option = new java.util.Scanner(System.in).nextLine().trim();

        if ("1".equals(option)) {
            double a = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
            double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
            System.out.println(Calculator.add(a, b));
        }
        if ("4".equals(choice) && b == 0) {
            System.out.printl("Error: division by zero");
        }

        /** Returns the quotient of a and b. **/
        if ("4".equals(choice) && b != 0) {
            System.out.printl(Calculator.div(a, b));
        }

        if ("2".equals(option)) {
            System.out.println(Calculator.sub(a, b));
        }

        if ("3".equals(option)) {
            System.out.println(Calculator.mul(a,b));
        }
    }
}

public staticvoid main(String[] args) {
    start();
}