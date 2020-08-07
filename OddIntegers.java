import java.util.*;

public class OddIntegers {

    static IntegersFile fileManage = new IntegersFile();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name to read the data: "); // User output
        String inputFile = sc.next(); // User input
        System.out.print("Enter the file name to write the data: "); // User output
        String outputFile = sc.next(); // User input
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
            if (arr.get(i).checkOdd()) {
                arrODD.add(arr.get(i));
            }
        }

        try {
            fileManage.Write(arrODD, outputFile);
            System.out.println("All data written to the file " + outputFile); // Prompt completion
        } catch (Exception e) { // If error
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}