import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = mathPower(number, power);

        System.out.printf("%.0f", result);

    }

    private static double  mathPower(double number, int power){

        return Math.pow(number, power);
    }
}
