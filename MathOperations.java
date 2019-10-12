import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {

    public static double calculatedResult(int firstNumber, String operator, int secondNumber) {
        double result = 0.0;
        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        String operator = scanner.next();
        int secondNumber = scanner.nextInt();

        System.out.println(new DecimalFormat("0.####").format(calculatedResult(firstNumber, operator, secondNumber)));
    }
}
