import student.Student;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt(2);
        Student student=new Student();
//        Scanner scanner=new Scanner(System.in);
        System.out.println("选择去哪个食堂吃饭：");
        System.out.println("1.中心食堂  2.千喜鹤");
        student.run();
//        int a=scanner.nextInt();
//        student.choose(x);
    }
}
