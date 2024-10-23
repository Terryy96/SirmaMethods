import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("int")){
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int result = getMax(first, second);
            System.out.println(result);
        } else if (input.equals("char")) {
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            char result = getMax(firstChar, secondChar);
            System.out.println(result);
        } else if (input.equals("string")) {
            String firstStr = scanner.nextLine();
            String secondStr = scanner.nextLine();
            String result = getMax(firstStr, secondStr);
            System.out.println(result);
        }

    }

    static int getMax(int first, int second) {
        if (first>second){
            return first;
        }
        return second;
    }

    static char getMax(char first, char second) {
        if (first>second){
            return first;
        }
        return second;
    }
    static String getMax(String first, String second) {
        if (first.compareTo(second)>0){
            return first;
        }
        return second;
    }
}
