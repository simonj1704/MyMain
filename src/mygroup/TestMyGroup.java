package mygroup;

import java.util.Scanner;

public class TestMyGroup {
    public void run(){
        //TODO make it so you can enter information yourself
        GroupMember g1 = new GroupMember("Simon",   "+45 60410451", "Simo915m@Stud.kea.dk", Gender.MALE);
        GroupMember g2 = new GroupMember("Lars", "+45 24883302", "Lars.J@gmail.com", Gender.MALE);

        System.out.printf("Member 1: %s, %s, %s, %s\n", g1.getName(), g1.getPhoneNumber(), g1.geteMail(), g1.getGender());
        System.out.printf("Member 1: %s, %s, %s, %s\n", g2.getName(), g2.getPhoneNumber(), g2.geteMail(), g1.getGender());
    }

    public static void main(String[] args) {
        TestMyGroup testMyGroup = new TestMyGroup();
        testMyGroup.run();
    }
}
