import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Buffered {

  public static void main(String[] args) throws IOException {

    Path cithPath = Paths.get("scratch\\cat_in_the_hat.txt");
    File cithFile = cithPath.toFile();

    // Read the lines in the file. Read characters
    FileReader fileReader = new FileReader(cithFile);
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    // Creater a new file name and store it in writer
    FileWriter fileWriter = new FileWriter("scratch\\buffered_cith.txt");
    String line;

    while (null != (line = bufferedReader.readLine())) {
      fileWriter.write(line);
      fileWriter.write("\n");
    }

    // Close the reader
    bufferedReader.close();
    fileReader.close();

    // Close the writer
    fileWriter.flush();
    fileWriter.close();
  }
}
