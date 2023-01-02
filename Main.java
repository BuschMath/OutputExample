import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        File outFile = new File("output.txt");
        outFile.createNewFile();
        System.out.println("File created: " + outFile.getName());

        FileWriter outWriter = new FileWriter(outFile);
        outWriter.write("This is a test output.");
        outWriter.close();
    }
}