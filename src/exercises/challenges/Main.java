package exercises.challenges;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Zebera","April", "May", "June", "JUL"};
        int[] arr2 = {1, 22,33,66,12,44,65};

        BinarySearch searchText = new BinarySearch(arr, "June");
        BinarySearch searchNum = new BinarySearch(arr2, 1);

    }
}
