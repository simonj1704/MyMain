package mygrades;

import java.util.Arrays;

public class Student {
    private static int nextNumber;
    private int studieNummer;
    private String name;
    private Grades karakter;

    private int nextGrade;

    private Grades[] grades = new Grades[7];

    public Student (String name){
        setName(name);
        studieNummer = nextNumber++;
    }

    public int getStudieNummer(){
        return studieNummer;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public String getKarakter(){
        return Arrays.toString(grades);
    }

    public void addGrade(int grade){

        switch (grade){
            case -3 -> karakter = Grades.MINUSTHREE;
            case 0 ->  karakter = Grades.ZERO;
            case 2 -> karakter = Grades.TWO;
            case 4 ->  karakter = Grades.FOUR;
            case 7 -> karakter = Grades.SEVEN;
            case 10 -> karakter = Grades.TEN;
            case 12 -> karakter = Grades.TWELVE;
        }
        grades[nextGrade++] = karakter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", karakter=" + karakter +
                '}';
    }
}

