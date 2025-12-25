package LinearSearch;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(findTarget(arr,target));
    }
    static int findTarget(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
