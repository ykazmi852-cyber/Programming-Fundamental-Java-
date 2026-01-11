import java.util.Scanner;

public class Question2
{
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);

      double pi = 3.142;

      System.out.println("Enter radius of circle");
      double r = read.nextDouble();
      
      double p = (2 * pi * r);
      double a = (pi * r * r); // Math.pow(r,2)

      System.out.println("Circumference of circle = " + p);
      System.out.println("Area of cirlce =" + a);
    }
}

