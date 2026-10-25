public class StoreRevenueAnalysisL3 {
    public static void main(String[] args) {
        int[] revenue = {250, 300, 180, 420, 350, 300, 500, 150, 420, 380};

        int total = 0;

        // Total revenue
        for (int i = 0; i < revenue.length; i++) {
            total += revenue[i];
        }

        double average = (double) total / revenue.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // Days above average
        System.out.println("Days above average:");
        for (int i = 0; i < revenue.length; i++) {
            if (revenue[i] > average) {
                System.out.println("Day " + (i + 1)
                        + ": " + revenue[i]);
            }
        }

        // Most frequent revenue
        int maxFrequency = 0;

        for (int i = 0; i < revenue.length; i++) {
            int frequency = 0;

            for (int j = 0; j < revenue.length; j++) {
                if (revenue[i] == revenue[j]) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        System.out.println("Most frequent revenue values:");
        for (int i = 0; i < revenue.length; i++) {
            int frequency = 0;
            boolean seen = false;

            for (int j = 0; j < revenue.length; j++) {
                if (revenue[i] == revenue[j]) {
                    frequency++;
                }
            }

            for (int j = 0; j < i; j++) {
                if (revenue[i] == revenue[j]) {
                    seen = true;
                }
            }

            if (frequency == maxFrequency && !seen) {
                System.out.println(revenue[i]);
            }
        }

        // Two highest revenue days
        int first = 0;
        int second = 1;

        if (revenue[second] > revenue[first]) {
            int temp = first;
            first = second;
            second = temp;
        }

        for (int i = 2; i < revenue.length; i++) {
            if (revenue[i] > revenue[first]) {
                second = first;
                first = i;
            } else if (revenue[i] > revenue[second]) {
                second = i;
            }
        }

        System.out.println("Highest day: Day " + (first + 1));
        System.out.println("Second highest day: Day " + (second + 1));

        // Days with decreased revenue
        int decrease = 0;

        for (int i = 1; i < revenue.length; i++) {
            if (revenue[i] < revenue[i - 1]) {
                decrease++;
            }
        }

        System.out.println("Days with decreased revenue: " + decrease);
    }
}
