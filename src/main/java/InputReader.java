import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

/**
 * Class for reading valid user inputs
 * 
 * @author Tiago Cardoso dos Passos
 * @since 18/06/2020
 */
public class InputReader {
    
    private static final BufferedReader r = new BufferedReader(new InputStreamReader (System.in));
    
    /**
     * Reads a string input
     * 
     * @return String
     */
    public static String readLine() {
        return readLine("", (String str) -> true);
    }
    
    /**
     * Reads a string input
     * 
     * @param message Message that will be displayed before capturing the input
     * @return String
     */
    public static String readLine(String message) {
        return readLine(message, (String str) -> true);
    }
    
    /**
     * Reads a string in a loop until the text is valid according to the validator
     * 
     * @param validator Code that will validate the input. Must return true if valid and false otherwise
     * @return Valid string
     */
    public static String readLine(Predicate<String> validator) {
        return readLine("", validator);
    }
    
    /**
     * Reads a string in a loop until the text is valid according to the validator
     * 
     * @param message Message that will be displayed before capturing the input
     * @param validator Code that will validate the input. Must return true if valid and false otherwise
     * @return Valid string
     */
    public static String readLine(String message, Predicate<String> validator) {
        while (true) {            
            try {
                System.out.print(message);
                String input = r.readLine();
                if (validator.test(input)) {
                    return input;
                }
            } catch (IOException e) {
                return "";
            }
        }
    }

}
