public class BinarySearchRecursive {

    public static int binarySearchRecursive(
            int[] a, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        }

        if (target < a[mid]) {
            return binarySearchRecursive(
                    a, target, low, mid - 1);
        }

        return binarySearchRecursive(
                a, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println("Example 1: " +
                binarySearchRecursive(a, 7, 0, a.length - 1));

        System.out.println("Example 2: " +
                binarySearchRecursive(a, 13, 0, a.length - 1));

        System.out.println("Example 3: " +
                binarySearchRecursive(a, 4, 0, a.length - 1));
    }
}
