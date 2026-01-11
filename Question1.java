import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Enter obtained marks:");
        x = read.nextDouble();

        System.out.println("Enter maximum marks:");
        y = read.nextDouble();

        double p = (x / y) * 100;
         System.out.println("Percentage = " + p);
    }
}
