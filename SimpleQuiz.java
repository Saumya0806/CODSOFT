import java.util.Scanner;

public class SimpleQuiz {
    static String[] questions = {
        "What is the capital of India?",
        "Which Cricketer is known as the king of world cricket?",
        "Which team won 2024 T2o wordld cup ?"
    };

    static String[][] options = {
        {"1. Paris", "2. London", "3. New Delhi", "4. Madrid"},
        {"1. Ms Dhoni", "2. Virat kohli", "3. Steve smith", "4. Kane williamson"},
        {"1. India", "2. South Africa", "3. Afganistan", "4. Srilanka"}
    };

    static int[] correctAnswers = {3, 2, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        long startTime, endTime;
        final int TIME_LIMIT = 10; // Time limit in seconds

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            startTime = System.currentTimeMillis();
            int userAnswer = scanner.nextInt();
            endTime = System.currentTimeMillis();

            if ((endTime - startTime) / 1000 > TIME_LIMIT) {
                System.out.println("Time's up!");
                continue;
            }

            if (userAnswer == correctAnswers[i]) {
                score++;
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
