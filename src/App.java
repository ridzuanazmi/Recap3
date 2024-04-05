import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Path object by calling the get() method of the Paths class
        Path cithPath = Paths.get("scratch\\cat_in_the_hat.txt"); // Specify a Path object
        File cith = cithPath.toFile(); // Convert the Path object to a File object

        // You can then use methods of the Path interface to manipulate the path
        System.out.println("File name: " + cithPath.getFileName());
        System.out.println("Parent directory: " + cith.getParent());

        // You can resolve paths
        Path resolvedPath = cithPath.resolveSibling("anotherfile.txt");
        System.out.println("Resolved Path: " + resolvedPath);

        // Create a File object representing a file path
        File file = new File("scratch\\createdFile_from_line20.txt");
        File cithFile = Paths.get( "scratch\\cat_in_the_hat.txt").toFile();

        // Check if the file exists
        if (cithFile.exists()) {
            System.out.println("File exists.");
            System.out.println("The size of the file is " + cithFile.length() + " bytes.");
        } else {
            System.out.println("File does not exist.");
        }

        try {
            // Create a new file
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
}
