import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(number, operator, secondNum));
    }

    private static int calculate (int number, String operator, int secondNum){
        int result = 0;
        switch (operator){
            case "/":
                result = Math.abs(number/secondNum);
                break;
            case "*":
                result = Math.abs(number*secondNum);
                break;
            case "+":
                result = Math.abs(number+secondNum);
                break;
            case "-":
                result = Math.abs(number-secondNum);
                break;
        }
        return result;
    }
}
