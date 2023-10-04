import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList Example");

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> myStudents = new ArrayList<>();

        myStudents.add(new Student("W123456", 66, 88));
        System.out.println(myStudents.size());
        myStudents.add(new Student("W777777", 99, 88));
        System.out.println(myStudents.size());
        myStudents.add(new Student("W333333", 77, 55));
        System.out.println(myStudents.size());

        for (Student myCurrentStudent :myStudents) {
            myCurrentStudent.stdReport();
            System.out.println();
        }

        System.out.println("Using For Loop");
        for (int i = 0; i < myStudents.size(); i++) {
            myStudents.get(i).stdReport();
        }



    }
}
