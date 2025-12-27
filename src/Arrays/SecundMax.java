package Arrays;

public class SecundMax {
    public static void main(String[] args) {
        int[] arr = {12,22,33,44,11,66};
        System.out.println(findSecondMax(arr));
    }
    static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : arr) {
            if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }
}
