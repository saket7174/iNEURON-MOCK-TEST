// 3. Write a Java program to calculate the average of a list of numbers using a do-while loop.
import java.util.Scanner;

public class Third{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int numElements = scanner.nextInt();

        if (numElements <= 0) {
            System.out.println("Invalid input. Number of elements must be greater than 0.");
            return;
        }

        int sum = 0;
        int count = 0;

        System.out.println("Enter the numbers:");

        do {
            int num = scanner.nextInt();
            sum += num;
            count++;
        } while (count < numElements);

        double average = (double) sum / numElements;

        System.out.println("Average: " + average);
    }
}
