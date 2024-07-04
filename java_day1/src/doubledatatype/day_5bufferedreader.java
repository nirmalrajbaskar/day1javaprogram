package doubledatatype;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class day_5bufferedreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Use the class loader to get the resource URL for the file in the same package
        URL resource = day_5bufferedreader.class.getResource("MVIT.txt");
        
        // Check if the resource URL is null (file not found)
        if (resource == null) {
            System.err.println("File not found");
            return;
        }

        // Convert the URL to a File object
        File file = new File(resource.getFile());

        // Create a FileReader object to read the file
        FileReader fileReader = new FileReader(file);
        
        // Create a BufferedReader object to wrap the FileReader
        BufferedReader reader = new BufferedReader(fileReader);

        // Variable to hold each line read from the file
        String line;

        // Read the file line by line using readLine() method
        while ((line = reader.readLine()) != null) {
            // Print each line to the console
            System.out.println(line);
        }

        // Close the BufferedReader to free up resources
        reader.close();

	}}
	
