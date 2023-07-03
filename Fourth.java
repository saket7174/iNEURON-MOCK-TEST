// 4. Write a Java program to find the largest of three numbers using nested if-else statements.
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers as a,b,c ");
        Scanner r = new Scanner (System.in);
        a= r.nextInt();
        b= r.nextInt();
        c= r.nextInt();
        if (a>b&&a>c)
        {
        System.out.println("a is greatest");
        }
        else if (b>a&&b>c) {
            System.out.println("b is greatest");
        } else {
           System.out.println("c is greatest"); 
        }
    }
}
