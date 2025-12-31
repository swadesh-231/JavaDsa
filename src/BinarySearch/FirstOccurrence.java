package BinarySearch;

import java.util.ArrayList;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4,5,5,5,5,5,6,6,6,6,7,8,8,9,9,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        int ans1 = firstOccurrence(arr,5);
        int ans2 = lastOccurrence(arr,5);
        list.add(ans1);
        list.add(ans2);
        System.out.println(list);
    }
    static int firstOccurrence(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                index = mid;
                high = mid-1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else low = mid+1;
        }
        return index;
    }
    static int lastOccurrence(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                index = mid;
                low = mid+1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else low = mid+1;
        }
        return index;
    }
}
