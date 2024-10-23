import java.util.Scanner;

public class SignInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        signOfInteger(Integer.parseInt(scanner.nextLine()));
    }
    public static void signOfInteger (int number) {
        if (number<0){
            System.out.printf("The number %d is negative.", number);
        }else if(number>0){
            System.out.printf("The number %d is positive.", number);
        }else if(number==0){
            System.out.printf("The number %d is zero.", number);
        }
    }
}
