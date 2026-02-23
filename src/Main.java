import algorithms.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int binarySearch = BinarySearch.search(new int[] {10, 20, 30, 40, 50}, 40);
        System.out.println(binarySearch);
    }
}