import java.io.*;
import java.util.*;

public class IntegersFile { // Manages save file
    public void Write(ArrayList<IntCheck> data, String outputFile) throws Exception { // Write to save file
        File output = new File(outputFile);
        output.createNewFile(); // Try creating file to write to
        FileWriter write = new FileWriter(outputFile); // Write
        for (int i = 0; i < data.size(); i++) { // Iterate through all odd integers in array
            write.write(data.get(i).toString()); // Write number to file
        }
        write.close();
    }

    public ArrayList<IntCheck> Read(String inputFile) throws Exception { // Read save file
        ArrayList<IntCheck> arr = new ArrayList<IntCheck>(); // Create array to store numbers
        File input = new File(inputFile);
        if (!input.exists()) {
            throw new Exception("Read file does not exist");
        }
        Scanner read = new Scanner(input);
        while (read.hasNext()) { // Iterate through all words/integer in file (separated by " " or new line)
            try {
                OddIntegers OddIntegers = new OddIntegers();
                String s = read.next(); //Read next word/integer (Separated by " ")
                OddIntegers.checkInteger(s); //Check if is integer
                arr.add(new IntCheck(Integer.parseInt(s))); // Add integer to array
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        read.close();
        return arr; // Return Array List
    }
}