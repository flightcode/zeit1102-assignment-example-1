import java.util.*;

public class OddIntegers { // Main class, requests input for file, and processes output to write file

    static IntegersFile fileManage = new IntegersFile();

    public static void main(String[] args) { // Main function
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name to read the data: "); // User output
        String inputFile = sc.next(); // User input for read file
        System.out.print("Enter the file name to write the data: "); // User output
        String outputFile = sc.next(); // User input for write file
        sc.close();

        ArrayList<IntCheck> arr = new ArrayList<IntCheck>();
        try {
            arr = fileManage.Read(inputFile); // Read file to array
        } catch (Exception e) { // If error
            System.out.println("Cannot open the file");
            e.printStackTrace();
        }

        ArrayList<IntCheck> arrODD = new ArrayList<IntCheck>();
        for (int i = 0; i < arr.size(); i++) { // Iterate through all integers in array
            if (arr.get(i).checkOdd()) { // Check if odd
                arrODD.add(arr.get(i)); // Add to array
            }
        }

        try {
            fileManage.Write(arrODD, outputFile); // Write odd integers to file
            System.out.println("All data written to the file " + outputFile); // Prompt completion
        } catch (Exception e) { // If error
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void checkInteger(String s) throws Exception {
        try {
            Integer.parseInt(s); //Check if can parse into integer
        } catch(Exception e) {
            throw new NotIntegerException(s + " not in appropriate integer format... " + e); //Throw exception
        }
    } 
}