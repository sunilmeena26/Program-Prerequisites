import java.util.Scanner;
class AreaOfCircle
{
  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Redius Of Circle : ");
   double redius=sc.nextDouble();
   double area=Math.PI*Math.pow(redius,2);
   System.out.println("Area of a Circle = "+area);
   }
}