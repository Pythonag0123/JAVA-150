package Arrays;

public class Linear_Search {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 8};
        int item = 7;

        
        int index = Search(arr, item);

        
        if (index != -1) {
            System.out.println("Item found at index: " + index);
        } else {
            System.out.println("Item not found in the array.");
        }
    }

    public static int Search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
