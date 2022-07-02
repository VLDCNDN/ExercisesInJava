package exercises.challenges;

import java.util.Arrays;

public class BinarySearch {
    public BinarySearch(String[] arr, String target) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public BinarySearch(int[] arr, int target) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int median = Math.round(arr.length / 2);
        int steps = 0;

        while(start <= end) {
            if(arr[median] == target) {
                System.out.println("Position: " + median);
                System.out.println("Step takes: " + steps);
                break;
            } else if (target > arr[median]) {
                start = median + 1;
            } else if (target < arr[median]) {
                end = median - 1;
            }
            median = Math.round((end + start) / 2);
            steps++;
        }
    }
}
