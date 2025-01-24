import java.util.Scanner;
class RectArea 
{
  public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        double Area = length*width;

	System.out.println("Area = " +Area);
}
}