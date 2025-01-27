import java.util.Scanner;

class OrOperator

{

public static void main(String args[])

{

Scanner sc = new Scanner(System.in);

System.out.print("Enter a character ");

char ch = sc.next().charAt(0);

// check whether this char is in lower or upper case

//ascii range for lower case= 97-122

 boolean lower = ch>=97 && ch<=122;
System.out.println(ch+ "is in the lower case:" +lower);

boolean upper = ch>=65 && ch<=90;
System.out.println(ch+ "is in the upper case:" +upper);

// checking input is alphabet or not

boolean result  = lower || upper;
System.out.println(ch+ "is alphabet or not:" +result);

}

}

