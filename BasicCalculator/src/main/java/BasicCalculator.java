import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first number ");
        double firstNum = scanner.nextDouble();

        System.out.println("Possible calculation: (M) add, (S) subtract, (D) divide, (M) multiply. Please select an option: ");
        String userInput = scanner.next();
        System.out.println("What is your second number ");
        double secondNum = scanner.nextDouble();

        if (userInput.equals("a")) {
            System.out.println(firstNum + secondNum);
        } else if (userInput.equals("s")) {
            System.out.println(firstNum - secondNum);
        } else if (userInput.equals("d")) {
            System.out.println(firstNum / secondNum);
        } else if (userInput.equals("m")) {
            System.out.println(firstNum * secondNum);
        }
    }
}