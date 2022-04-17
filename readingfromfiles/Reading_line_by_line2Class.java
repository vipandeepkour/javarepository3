package readingfromfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reading_line_by_line2Class {

	public static void main(String[] args) throws IOException 
	{
			Scanner sc= new Scanner(System.in) ;
			String subject;
			System.out.println("Enter subject name:");
			subject=sc.nextLine();
			boolean  isFound = false;
			File f= new File("D:\\Simplilearn\\readingfiles2.txt");
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String line= br.readLine();
			while(line!=null)
			{
				var data=line.split(":");
				if (data[0]==subject)
				{
				System.out.println(data[1]);
				isFound= true;
				break;
				}
				
				line=br.readLine();
			}
			br.close();
			if (isFound==false)
				System.out.println("Subject not found");
	}

}
