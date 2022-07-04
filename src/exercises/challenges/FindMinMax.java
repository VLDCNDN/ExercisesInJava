package exercises.challenges;

import java.util.Arrays;

public class FindMinMax {
    public static int min(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int max(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
