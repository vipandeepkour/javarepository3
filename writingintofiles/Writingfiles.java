package writingintofiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writingfiles {

	public static void main(String[] args) throws IOException
		{
		String content="writing into file2";
		File f= new File("D:\\Simplilearn\\writing.txt");
		FileWriter fw= new FileWriter(f,true);// appending data in order to avoid overwriting
		fw.write (content);
		fw.close();
		System.out.println("writing sucess");

		}

	}
		