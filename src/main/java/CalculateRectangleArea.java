import java.util.Scanner;

public class CalculateRectangleArea {

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            Double width = Double.parseDouble(scanner.nextLine());
            Double height = Double.parseDouble(scanner.nextLine());
            Double area = areaOfRectangle(width, height);
            System.out.printf("%.0f", area);

    }


        private static double areaOfRectangle(double width, double height) {
            return width*height;
    }
}
