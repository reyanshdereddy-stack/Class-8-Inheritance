import java.util.Scanner;
class Addition {
    void add(int a, int b) {
        System.out.println("Result of Addition: " + (a + b));
    }
}
class Subtraction extends Addition {
    void subtract(int a, int b) {
        System.out.println("Result of Subtraction: " + (a - b));
    }
}
class Multiplication extends Subtraction {
    void multiply(int a, int b) {
        System.out.println("Result of Multiplication: " + (a * b));
    }
}
class Division extends Multiplication {
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Result of Division: " + (a / b));
        } else {
            System.out.println("Error: Division by zero.");
        }
    }
}

public class Afterclassproject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Division calc = new Division();
        System.out.println("Select operation: 1-Add, 2-Subtract, 3-Multiply, 4-Divide");
        int choice = s.nextInt();
        System.out.print("Enter first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter second number: ");
        int n2 = s.nextInt();
        switch (choice) {
            case 1: calc.add(n1, n2);
            break;
            case 2: calc.subtract(n1, n2);
            break;
            case 3: calc.multiply(n1, n2);
            break;
            case 4: calc.divide(n1, n2);
            break;
            default: System.out.println("Invalid selection of operation.");
        }
    }
}
