//write a program to find the square of a double number

import java.util.Scanner;

class Square 
{

	public static void main(String args[])

{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number ");

	double num = sc.nextDouble();

        double square = num*num;

        System.out.println("Square of entered number : " +square);
}

}