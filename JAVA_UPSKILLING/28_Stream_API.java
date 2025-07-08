import java.util.*;
import java.util.stream.Collectors;

public class StreamEven {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 5, 8, 11, 14);
        List<Integer> even = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + even);
    }
}