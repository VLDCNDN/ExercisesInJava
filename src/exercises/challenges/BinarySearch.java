package exercises.challenges;

import java.util.Arrays;

public class BinarySearch {
    public BinarySearch(String[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public BinarySearch(int[] arr) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        System.out.println(start + ":" + end);

    }
}
