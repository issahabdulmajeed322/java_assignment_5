
public class CourseScoresL4 {
    public static void main(String[] args) {
        int[][] scores = {
            {80, 75, 90},
            {65, 70, 85},
            {90, 95, 88},
            {72, 68, 78}
        };

        int students = scores.length;
        int courses = scores[0].length;

        double highestAverage = -1;
        int bestStudent = 0;

        // Display table and student averages
        System.out.println("Student\tC1\tC2\tC3\tAverage");

        for (int i = 0; i < students; i++) {
            int total = 0;

            System.out.print((i + 1) + "\t");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
                total += scores[i][j];
            }

            double average = (double) total / scores[i].length;

            System.out.printf("%.2f%n", average);

            if (average > highestAverage) {
                highestAverage = average;
                bestStudent = i;
            }
        }

        // Calculate course averages
        double lowestAverage = Double.MAX_VALUE;
        int lowestCourse = 0;

        for (int j = 0; j < courses; j++) {
            int total = 0;

            for (int i = 0; i < students; i++) {
                total += scores[i][j];
            }

            double average = (double) total / students;

            System.out.printf("Course %d Average: %.2f%n",
                    j + 1, average);

            if (average < lowestAverage) {
                lowestAverage = average;
                lowestCourse = j;
            }
        }

        System.out.println("Best Student: Student "
                + (bestStudent + 1));

        System.out.println("Course with Lowest Average: Course "
                + (lowestCourse + 1));
    }
}
