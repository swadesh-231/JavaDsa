package Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {12,22,33,44,55,76,8};
       findMaxAndMin(arr);
    }
    static void findMaxAndMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
}
