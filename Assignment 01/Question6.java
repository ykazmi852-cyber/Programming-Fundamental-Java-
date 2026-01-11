import java.util.Scanner;

public class Question6
{
   public static void main (String[]args)
   {
     Scanner read = new Scanner (System.in);
     
     System.out.println("Enter parallel side a length");
      double a = read.nextDouble();
     
      System.out.println("Enter parallel side b length");
      double b = read.nextDouble();
     
      System.out.println("Enter perpendicular distance between a and b parallel line");
      double h = read.nextDouble();
     
      double k = h * (a+b) / 2;
     
      System.out.println("Area:" + k);
   }
}