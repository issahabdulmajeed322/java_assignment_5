
public class DailySalesTotalL1  {
    public static void main(String[] args) {
        int[] sales = {100000, 150000, 125000, 200000, 175000};

        int total = 0;

        // Calculate total sales
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        // Display total sales
        System.out.println("Total Sales: Rp" + total);

        // Display number of elements
        System.out.println("Number of days: " + sales.length);
    }
}
