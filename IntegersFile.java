import java.io.*;
import java.util.*;

public class IntegersFile { // Manages save file
    public void Write(ArrayList<IntCheck> data, String outputFile) throws Exception { // Write to save file
        File output = new File(outputFile);
        output.createNewFile(); // Try creating file to write to
        FileWriter write = new FileWriter(outputFile); // Write
        for (int i = 0; i < data.size(); i++) { // Iterate through all odd integers in array
            if (data.get(i).getType() != "EVEN" && data.get(i).getType() != "ODD") {
                write.close();
                throw new NotCheckedException("Int type has not been checked yet!");
            }
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
        while (read.hasNextInt()) { // Iterate through all integers in file (separated by " " or new line)
            arr.add(new IntCheck(read.nextInt())); // Add integer to array
        }
        read.close();
        return arr; // Return Array List
    }
}