import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    private static String fileName;

    private static String currentWorkingDir = System.getProperty("user.dir");
    private static File file;

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter file name :");

        fileName = myObj.nextLine();  // Read user input
        try {
            file = new File(currentWorkingDir + "\\" + fileName);
            if (doesFileExist(file)) {
                readEntireFile(file); // function call to read file line by line
            } else {
                System.out.println("file does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Function reads file line by line and print result
     *
     * @param file
     * @throws FileNotFoundException
     */
    private static void readEntireFile(File file) throws FileNotFoundException {
        // read file line by line and print the o/p
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split("[\\-\\,]");
            System.out.println();
            for (String str : line)
                System.out.println(str.trim());
        }
    }

    /**
     * function checks if file exist in current directory or not
     * @param s
     * @return
     */
    private static boolean doesFileExist(File s) {
        // look file in the current directory
        return file.exists();
    }
}
