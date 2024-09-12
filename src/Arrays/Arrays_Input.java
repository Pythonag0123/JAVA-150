package Arrays;
import java.util.*;

public class Arrays_Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the size of the array
        int[] arr = new int[n];  // Create an array of size n

        // Take array input from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        

        // Call the Display method to print the array
        Display(arr);
        sc.close();
    }

    // Define the Display method to print the array
    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
