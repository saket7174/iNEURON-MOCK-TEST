
//1. Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int num;
    
        System.out.println("Enter the number to be checked ");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();
        if (num > 0) {
            System.out.println("The given number is positive");
        } else if (num == 0) {
            System.out.println("the given number is zero");
        } else {
            System.out.println("The given number is negative");
        }

    }
}
