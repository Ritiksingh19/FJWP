//Write a program to check whether a charater is alphabet, number or a special character 

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter a character: ");

        char ch = sc.next().charAt(0);  
        
        
        int asciiValue = (int) ch;
        
        if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
            System.out.println(ch + " is an alphabet.");
        } else if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println(ch + " is a number.");
        } else {
            System.out.println(ch + " is a special character.");
        }
        
        
       
    }
}
