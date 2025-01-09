import java.util.Scanner;
class RectanglePerimeter
{
  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Length Of Rectangle : ");
   int length=sc.nextInt();
   System.out.println("Enter Width Of Rectangle : ");
   int width=sc.nextInt();
   int perimeter=2*(length+width);
   System.out.println("Perimeter Of A Rectangle = "+perimeter);
   }
}