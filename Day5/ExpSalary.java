import java.util.Scanner;

class ExpSalary

{

public static void main(String args[])

{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the experience of employee");

int exp = sc.nextInt();

System.out.println("Enter the salary of employee");

int salary = sc.nextInt();

double result = (exp > 20) ? (salary * 0.20) : (salary * 0.10);
     
System.out.println("Result: " + result);

}

}
