package Arrays;

import java.util.Scanner;

public class InsertInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (0-based): ");
        int pos = sc.nextInt();

        int[] newArr = new int[n + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.print("After insertion: ");
        for (int x : newArr) {
            System.out.print(x + " ");
        }

    }
}
