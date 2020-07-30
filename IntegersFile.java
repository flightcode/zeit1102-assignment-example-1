import java.io.*;
import java.util.*;

public class IntegersFile {
    public void Write(ArrayList<Integer> data, String outputFile) throws Exception {
        File output = new File(outputFile);
        output.createNewFile(); // Try creating file to write to
        FileWriter write = new FileWriter(outputFile); // Write
        for (int i = 0; i < data.size(); i++) { // Iterate through all odd integers in array
            write.write(data.get(i) + " "); // Write number to file
        }
        write.close();
    }

    public ArrayList<Integer> Read(String inputFile) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>(); // Create array to store numbers
        File input = new File(inputFile);
        if (!input.exists()) {
            throw new Exception("Read file does not exist");
        }
        Scanner read = new Scanner(input);
        while (read.hasNextInt()) { // Iterate through all integers in file (separated by " " or new line)
            arr.add(read.nextInt()); // Add integer to array
        }
        read.close();
        return arr; // Return Array List
    }
}