import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put(1, "Anjana");
        map.put(2, "Rahul");

        System.out.print("Enter student ID to fetch name: ");
        int id = sc.nextInt();

        String name = map.get(id);
        System.out.println(name != null ? "Name: " + name : "ID not found");
    }
}