import java.util.Scanner;

class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if(b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        Calculator calc = new Calculator();

        switch(op) {
            case "+":
                System.out.println("Result: " + calc.add(a, b));
                break;
            case "-":
                System.out.println("Result: " + calc.subtract(a, b));
                break;
            case "*":
                System.out.println("Result: " + calc.multiply(a, b));
                break;
            case "/":
                System.out.println("Result: " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
