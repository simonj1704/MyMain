package mygrades;

public class TestMyStudent {
    public void run(){
        Student s1 = new Student("Bob");
        Student s2 = new Student("Haley");
        Student s3 = new Student("Patty");
        Student s4 = new Student("Pop");

        s1.addGrade(2);
        s1.addGrade(4);
        s1.addGrade(10);
        s1.addGrade(-3);
        System.out.println(s1.getKarakter());

        s2.addGrade(-3);
        s2.addGrade(4);
        s2.addGrade(10);
        s2.addGrade(12);
        System.out.println(s2.getKarakter());
    }
    public static void main(String[] args) {
        TestMyStudent testMyStudent = new TestMyStudent();
        testMyStudent.run();
    }
}
