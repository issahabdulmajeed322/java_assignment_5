public class RemoveDuplicateDateL3 {
public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102, 104, 105, 103};
        int[] unique = new int[ids.length];
        int count = 0;

        System.out.println("Duplicate IDs:");

        for (int i = 0; i < ids.length; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (ids[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = ids[i];
                count++;
            } else {
                // Print each duplicated ID only once
                boolean printedBefore = false;

                for (int j = 0; j < i; j++) {
                    if (ids[j] == ids[i]) {
                        int occurrences = 0;
                        for (int k = 0; k <= j; k++) {
                            if (ids[k] == ids[i]) {
                                occurrences++;
                            }
                        }
                        if (occurrences >= 2) {
                            printedBefore = true;
                            break;
                        }
                    }
                }

                if (!printedBefore) {
                    System.out.println(ids[i]);
                }
            }
        }

        System.out.println("Unique IDs:");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        System.out.println("\nTotal unique participants: " + count);
    }
}
