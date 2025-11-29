public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34};
        int max = arr[0];

        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Largest = " + max);
    }
}
