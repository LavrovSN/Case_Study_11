package main;

import java.util.ArrayList;

class StudentAnswerSheet {

    private ArrayList<String> answers;
    private String name;

    public StudentAnswerSheet(String n, String[] a) {
        name = n;
        answers = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            answers.add(a[i]);
    }

    public double getScore(ArrayList<String> key) {
        double score = 0.0;
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(key.get(i))) {
                score += 1.0;
            } else if (!answers.get(i).equals("?")) {
                score -= 0.25;
            }
        }
        return score;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> studentAnswers() {
        return answers;
    }
}