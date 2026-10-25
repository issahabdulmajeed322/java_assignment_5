
public class ExamScoresAnalysisL2 {
    public static void main(String[] args) {
        int[] scores = {75, 80, 65, 90, 55, 85, 70, 95};

        int total = 0;
        int pass = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];

            if (scores[i] >= 70) {
                pass++;
            }
        }

        double average = (double) total / scores.length;
        double percentage = (double) pass / scores.length * 100;

        System.out.println("Average: " + average);

        System.out.println("Scores above average:");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.println(scores[i]);
            }
        }

        System.out.println("Students passed: " + pass);
        System.out.println("Pass percentage: " + percentage + "%");
    }
}
