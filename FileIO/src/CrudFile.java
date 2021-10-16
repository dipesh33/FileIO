import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class CrudFile {
	public static void main(String[] args) throws Exception{
		
		//Created a txt file using bufferWrite 
		FileWriter writer = new FileWriter("C:\\Users\\Acer\\Documents\\testout.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Created a file ");
		buffer.close();
		System.out.println("success");
		
		//check a file exist
		File f = new File("C:\\Users\\Acer\\Documents\\testout.txt");
		if(f.exists()) {
			System.out.println("File found");
		}else {
			System.out.println("File not found");
		}
		
		//delete a file
		File d = new File ("C:\\Users\\Acer\\Documents\\testout.txt");
		d.delete();
		if(d.exists()) {
			System.out.println("file exist");
		}else {
			System.out.println("File doesn't exist");
		}
	}

}
