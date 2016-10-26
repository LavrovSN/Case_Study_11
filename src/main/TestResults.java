package main;

import java.util.ArrayList;

public class TestResults {

    private ArrayList<StudentAnswerSheet> sheets;
    private ArrayList<String> key;

    public TestResults() {
        sheets = new ArrayList<>();

        String[] student1 = {"?", "B", "?", "?", "B"};
        sheets.add(new StudentAnswerSheet("John Snow", student1));

        String[] student2 = {"A", "?", "B", "D", "A"};
        sheets.add(new StudentAnswerSheet("Steven Seagull", student2));

        String[] student3 = {"?", "B", "C", "D", "C"};
        sheets.add(new StudentAnswerSheet("Michael Jackson", student3));

        String[] student4 = {"A", "B", "?", "?", "D"};
        sheets.add(new StudentAnswerSheet("Donald Trump", student4));

        String[] stringkey = {"A", "B", "C", "D", "B"};
        key = new ArrayList<>();
        for (int i = 0; i < stringkey.length; i++)
            key.add(stringkey[i]);
    }

    public static void main(String[] args) {
        TestResults run = new TestResults();

        run.PrintScoresAndHighest();
    }

    public void PrintScoresAndHighest() {
        System.out.println("\n\n\n");
        System.out.println("KEY: " + key + "\n\n");
        for (int i = 0; i < sheets.size(); i++) {
            System.out.println(sheets.get(i).getName() + ": " + sheets.get(i).studentAnswers());
            System.out.print(sheets.get(i).getScore(key) + " for ");
            System.out.println(sheets.get(i).getName() + "\n");
        }
        System.out.println(highestScoringStudent(key) + " was the highest scoring student.");
        System.out.println("\n\n\n");
    }

    public String highestScoringStudent(ArrayList<String> key) {
        String bestStudent = new String();
        double bestScore = sheets.get(0).getScore(key);
        for (int loop = 1; loop < sheets.size(); loop++) {
            if (sheets.get(loop).getScore(key) > bestScore) {
                    bestStudent = sheets.get(loop).getName();
            }
        }
        return bestStudent;
    }
}
