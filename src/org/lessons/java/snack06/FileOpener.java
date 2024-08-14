package org.lessons.java.snack06;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileOpener {
	
	
	public String readText(String filePath) throws FileNotFoundException{

		File file = new File(filePath);
		Scanner fileReader = new Scanner(file);
		String result = "";
		
		if (fileReader.hasNextLine()) {
			result = fileReader.nextLine();
		}
		fileReader.close();		
		return result;
	}

}
