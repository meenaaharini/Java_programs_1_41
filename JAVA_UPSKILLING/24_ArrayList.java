import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student names (type 'end' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            names.add(name);
        }

        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}