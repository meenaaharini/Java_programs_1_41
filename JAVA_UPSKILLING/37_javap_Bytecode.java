// Java File
public class BytecodeExample {
    public void greet() {
        System.out.println("Hi!");
    }
}

// Command to inspect bytecode
javac BytecodeExample.java
javap -c BytecodeExample