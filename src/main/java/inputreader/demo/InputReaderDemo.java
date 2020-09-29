package inputreader.demo;

import inputreader.InputReader;

public class InputReaderDemo {
    
    public static void main(String[] args) {
        
        String name = InputReader.readLineWithMessage(
                "Enter a valid name: ", "[A-Za-z ]+$");
        int age = InputReader.readIntWithMessage(
                "Entera valid age: ", (int i) -> (i > 0));
        
        System.out.printf("%s is %d years old", name, age);
        
    }
    
}
