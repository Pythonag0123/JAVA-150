package Arrays;
import java.util.*;

public class Array_Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
      
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt();
        }
        
        display(arr);
        sc.close();
    }

    public static void display(int[] arr) {
    
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " ");
        }
    }
}
