package readingfromfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reading_char_by_char2Class {

	public static void main(String[] args) throws FileNotFoundException 
	{
	 
			File f= new File("D:\\Simplilearn\\readingfiles2.txt");
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);

	

}
	}