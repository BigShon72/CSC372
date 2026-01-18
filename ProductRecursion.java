import java.util.Scanner;

public class ProductRecursion {

    // Recursive method to compute product of array elements
    public static int product(int[] arr, int index) {
        // Base case: when we reach the last element
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Recursive case: multiply current element by product of rest
        return arr[index] * product(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input: ask user for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Compute product using recursion
        int result = product(numbers, 0);

        // Output result
        System.out.println("The product of the 5 numbers is: " + result);

        scanner.close();
    }
}
