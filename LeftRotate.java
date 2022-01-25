public class LeftRotate {
    public static void main(String[] args) {
        int[] arr1 = { 11, 12, 13, 14, 15, 16 };
        int n = arr1.length;
        int k = 4;
        System.out.println("\nOriginal array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            int temp1 = arr1[0];
            int j;
            for (j = 0; j < n - 1; j++) {
                arr1[j] = arr1[j + 1];
            }
            arr1[j] = temp1;
        }
        System.out.println("\nAfter left rotation the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}