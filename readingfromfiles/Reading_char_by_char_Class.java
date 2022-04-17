package readingfromfiles;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading_char_by_char_Class {

	public static void main(String[] args) throws IOException 
	{
		File f= new File ("D:\\Simplilearn\\Readinffiles1.txt");// Step 1. File object created and file path added
		FileReader fr= new FileReader(f); // Step 2. For reading from files char by char
		int i = fr.read() ;// reads first character
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
