class MaxMinL2 {
    public static void main(String[] args) {
        int[] temp = {29, 32, 27, 35, 31, 26, 34};

        int max = temp[0];
        int min = temp[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                maxIndex = i;
            }

            if (temp[i] < min) {
                min = temp[i];
                minIndex = i;
            }
        }

        int difference = max - min;

        System.out.println("Highest: " + max);
        System.out.println("Highest index: " + maxIndex);
        System.out.println("Lowest: " + min);
        System.out.println("Lowest index: " + minIndex);
        System.out.println("Difference: " + difference);
    }
}