package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void getExamScoresTest() {
        String firstName = "David";
        String lastName = "Gray";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        String actual = student.examAsString();

        String expectedOutput = "Exam Scores:\n" + "Exam 1 -> 100.0\n" + "Exam 2 -> 95.0\n" + "Exam 3 -> 123.0\n" + "Exam 4 -> 96.0\n";

        assertEquals(expectedOutput, actual);
    }

    @Test
    public void testAddExamScore() {

        String firstName = "Reggie";
        String lastName = "Weather";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        student.addExamScores(100.0);
        String actual = student.examAsString();

        String expectedOutput = "Exam Scores:\n" + "Exam 1 -> 100.0\n";
        assertEquals(expectedOutput, actual);
    }

    @Test
    public void testSetExamScore() {
        String firstName = "Darius";
        String lastName = "Farland";
        Double[] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);

        student.setExamScore(1, 150.0);
        String actual = student.examAsString();

        String expectedOutput = "Exam Scores:\n" + "Exam 1 -> 150.0\n";
        assertEquals(expectedOutput, actual);
    }

    @Test
    public void testGetAverageExamScore() {
        String firstName = "Ricky";
        String lastName = "Parrish";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);

        double average = student.getAverageExamScore();

        assertEquals(125.0, average, 0.001);

    }
}


