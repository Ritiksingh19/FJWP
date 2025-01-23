import java.util.Scanner
class CircleArea {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        double pi = 3.14;

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();


        double area = pi * radius * radius;


        System.out.println("The area of the circle is: " + area);
        
     
            }
}
