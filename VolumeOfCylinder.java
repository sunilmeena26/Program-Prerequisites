import java.util.Scanner;
class VolumeOfCylinder
{
  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Redius And Height Of Cylinder : ");
   double redius=sc.nextDouble();
   double height=sc.nextDouble();
   double area=Math.PI*Math.pow(redius,2)*height;
   System.out.println("Volume Of A Cylinder = "+area);
   }
}