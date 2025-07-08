import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String data = sc.nextLine();

        FileWriter writer = new FileWriter("output.txt");
        writer.write(data);
        writer.close();
        System.out.println("Data written to output.txt");
    }
}