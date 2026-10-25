
public class SearchEfficiencyL4 {
    public static void main(String[] args) {
        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int target = 75;

        // Linear search
        int linearChecks = 0;
        int linearIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            linearChecks++;

            if (numbers[i] == target) {
                linearIndex = i;
                break;
            }
        }

        // Binary search
        int left = 0;
        int right = numbers.length - 1;
        int binaryChecks = 0;
        int binaryIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            binaryChecks++;

            if (numbers[mid] == target) {
                binaryIndex = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Linear index: " + linearIndex);
        System.out.println("Linear checks: " + linearChecks);
        System.out.println("Binary index: " + binaryIndex);
        System.out.println("Binary checks: " + binaryChecks);
    }
}
