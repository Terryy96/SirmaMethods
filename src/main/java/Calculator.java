import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                addMethod(firstNum, secondNum);
                break;
            case "subtract":
                subtractMethod(firstNum, secondNum);
                break;
            case "multiply":
                multiplyMethod(firstNum, secondNum);
                break;
            case "divide":
                divideMethod(firstNum, secondNum);
                break;
        }


    }

    public static void addMethod (int firstNum, int secondNum){
        System.out.println(firstNum+secondNum);
    }
    public static void subtractMethod (int firstNum, int secondNum){
        System.out.println(firstNum-secondNum);
    }
    public static void multiplyMethod (int firstNum, int secondNum){
        System.out.println(firstNum*secondNum);
    }
    public static void divideMethod (int firstNum, int secondNum){
        System.out.println(firstNum/secondNum);
    }
}
