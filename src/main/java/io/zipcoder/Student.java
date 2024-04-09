package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }


    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String examAsString() {
        StringBuilder result = new StringBuilder("Exam Scores:\n");
        for (int i = 0; i < examScores.size(); i++) {
            int examNumber = i + 1;
            double score = examScores.get(i);
            result.append("Exam ").append(examNumber).append(" -> ").append(score).append("\n");
        }
        return result.toString();
    }

   public void addExamScores(double examScore) {
        examScores.add(examScore);
   }

   public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber -1, newScore);
   }

   public double getAverageExamScore() {
        double sum = 0;
        for (Double score : examScores) {
            sum += score;
        }
        return sum / examScores.size();
   }

   @Override
    public String toString() {
        String studentNames = "Student Name: " + firstName + " " + lastName + "\n";
        String averageScore = "-> Average Score: " + getAverageExamScore() + "\n";
        String examScore = "-> Exam Scores: \n" + getExamScores();

        return studentNames + averageScore + examScore;
   }
}







































/*
public class Student {
    private String firstName;
    private String lastName;
    private ArrayList <Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<Double> getExamScores() {
        return examScores;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public void addExamScores(double examScore) {
        examScores.add(examScore);
    }
    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber - 1, newScore);
    }
    public double getAverageExamScore(){
        return examScores.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
-

    @Override
    public String





}
 */