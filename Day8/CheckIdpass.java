import java.util.Scanner;

 class CheckIdpass {

    public static void main(String[] args) {
        
        String correctUserId = "user123";
        String correctPassword = "pass123";

        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();


        if (userId.equals(correctUserId) && password.equals(correctPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid User ID or Password. Please try again.");
        }


    }
}
