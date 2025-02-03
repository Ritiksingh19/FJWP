//wap to check whether a character is in lower case or upper case

import java.util.Scanner;

class CharCheck
{

	public static void main(String args[])

{

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a character");

	char ch = sc.next().charAt(0);

	int asciiValue = (int) ch;

	if (asciiValue >= 65 && asciiValue <= 90)
	{
		System.out.println("Upper case alphabet");
	
	}

	else if(asciiValue >= 97 && asciiValue <= 122)
	{
		System.out.println("Lower case alphabet");
	
	}

	else
	{
		System.out.println("Not alphabet");
	}
  

}

}