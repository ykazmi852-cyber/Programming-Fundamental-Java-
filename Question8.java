import java.util.Scanner;

public class Question8
{
   public static void main (String[]args)
   {
  
   Scanner read =  new Scanner(System.in);
    
     System.out.println("Enter side a length");
     double a = read.nextDouble();
     
     System.out.println("Enter side b length");
     double b = read.nextDouble();
     
     System.out.println("Enter side c length");
     double c = read.nextDouble();
     
     double s = (a+b+c) / 2;
     double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
     
     System.out.println("Area:" + Area ); 
   }
}