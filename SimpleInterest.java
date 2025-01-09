import java.util.Scanner;
class SimpleInterest
{
  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Priciple : ");
   int principle=sc.nextInt();
   System.out.println("Enter Rate in % : ");
   int rate=sc.nextInt();
   System.out.println("Enter Time In Year : ");
   int time=sc.nextInt();
   double simpleinterest=(principle*rate*time)/100;
   System.out.println("Simple Interest Is = "+simpleinterest);
   }
}