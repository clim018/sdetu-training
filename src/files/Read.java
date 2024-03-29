package files;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {
    public static void main(String[] args) {
	Path path = Paths.get("src/files/FileToRead.txt");

	// 1. Define the file (path) that we want to read
	String filename = path.toString();
	String text = null;

	// 2. Create the file in Java
	File file = new File(filename);

	try {
	    // 3. Open the file
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    // 4. Read the file
	     text = br.readLine();
	    // 5. Close the resources
	    br.close();
	} catch (FileNotFoundException e) {
	    System.out.println("Error: File not found: " + filename);
	    e.printStackTrace();
	} catch (IOException e) {
	    System.out.println("Error: Could not read file data: " + filename);
	    e.printStackTrace();
	}finally {
	    System.out.println("Finished reading the file.");
	}

	System.out.println(text);
    }
}
