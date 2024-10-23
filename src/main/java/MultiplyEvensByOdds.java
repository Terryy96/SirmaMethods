import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds (int n){
        int evenSum = getSumOfEvenDigits(n);
        int oddSum = getSumOfOddDigits(n);
        return evenSum*oddSum;
    }

    private static int getSumOfEvenDigits (int n){
        int evenSum = 0;
        while (n != 0) {
            int digit = n % 10;  // Get the last digit
            if (digit % 2 == 0) {     // Check if the digit is even
                evenSum += digit;
            }
            n /= 10;  // Remove the last digit
        }
        return evenSum;
    }

    public static int getSumOfOddDigits(int n) {
        int oddSum = 0;
        while (n != 0) {
            int digit = n % 10;  // Get the last digit
            if (digit % 2 != 0) {     // Check if the digit is odd
                oddSum += digit;
            }
            n /= 10;  // Remove the last digit
        }
        return oddSum;
    }
}
