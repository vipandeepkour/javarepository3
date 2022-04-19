package readingfromfiles;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;

public class Reading_Line_by_lineClass {

	public static void main(String[] args) throws IOException 
	{
		File f= new File("D:\\Simplilearn\\readfiles2.txt");//File f= new File("D:\\Simplilearn\\Readinffiles1.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br=new BufferedReader(fr);// reads line by line
		String Line= br.readLine();
		while(Line!=null) 
		{
		System.out.println(Line);	
		Line= br.readLine();
		}
		br.close();
	
		
	}

}