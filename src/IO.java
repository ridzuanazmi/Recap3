import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO {
  public static void main(String[] args) {

    // Exercise to copy the file contents from scratch/cat_in_the_hat.txt to
    // scratch/copy_cith.txt
    Path cithPath = Paths.get("scratch\\cat_in_the_hat.txt");
    File cithFile = cithPath.toFile();

    try {
      // Create a new file
      File copyFile = new File("scratch\\copy_cith.txt");
      boolean created = copyFile.createNewFile();
      if (created) {
        System.out.println("File created successfully.");
      } else {
        System.out.println("File already exists.");
      }

      // Open file
      InputStream inputStream = new FileInputStream(cithFile);
      byte[] buffer = new byte[1024];
      OutputStream outputStream = new FileOutputStream("scratch\\copy_cith.txt");

      // Read and copy contents of cat_in_the_hat.txt to copy_cith.txt
      int size = inputStream.read(buffer); // Read the first chunk of data
      // Size >0 when not end of file, size == -1 at end of file
      while (size >= 0) { // While there is data in the buffer
        System.out.printf("read: %s\n", size);
        outputStream.write(buffer, 0, size); // Write the buffer to output stream
        size = inputStream.read(buffer); // Read next chunk
      }

      inputStream.close();
      outputStream.flush();
      outputStream.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
