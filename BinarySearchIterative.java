public class BinarySearchIterative {

    public static int binarySearchIterative(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                return mid;
            } else if (target < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println("Example 1: " +
                binarySearchIterative(a, 7));

        System.out.println("Example 2: " +
                binarySearchIterative(a, 13));

        System.out.println("Example 3: " +
                binarySearchIterative(a, 4));
    }
}
