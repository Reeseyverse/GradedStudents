package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Classroom {
    Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }
    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        double sumExam = 0;
        int countExam = 0;

        for(Student student : students) {
            sumExam += student.getAverageExamScore();
            countExam++;
        }
        return sumExam / countExam;
    }

    public void addStudent(Student student) {
        for(int i = 0; i < students.length; i++){
            students[i] = student;
        break;
        }
    }

        public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < students.length; i++){
            if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                break;
            }

        }
        }

    public Student[] getStudentsByScore(){
        Arrays.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getAverageExamScore).
                reversed().thenComparing(Student::getLastName).reversed().thenComparing(Student::getFirstName)));
        return students;
    }

    public Map<Student, Character> getGradeBook(){
        Map<Student, Character> gBook = new LinkedHashMap<>();
        Student[] sStudents = getStudentsByScore();

        int tStudents = sStudents.length;
        int upper10thPercentile = tStudents / 10;
        int upper11thTo29thPercentile = tStudents * 2 / 10;
        int upper30thTo50thPercentile = tStudents * 5 / 10;
        int lower11thPercentile = tStudents - upper10thPercentile;

        for (int i = 0; i < sStudents.length; i++){

            if (i < upper10thPercentile) {
                gBook.put(sStudents[i], 'C');

            } else if ( i < upper11thTo29thPercentile) {
                gBook.put(sStudents[i], 'B');

            } else if ( i < upper30thTo50thPercentile) {
                gBook.put(sStudents[i], 'A');

            } else if ( i < lower11thPercentile) {
                gBook.put(sStudents[i], 'D');

            } else {
                gBook.put(sStudents[i], 'F');
            }
        }
        return gBook;
    }
    }




