import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOReader {
	public static void main(String[] args) {
		String path = "/C/Users/Acer/Documents/hekk";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			//read a file and print 
			while ((line = br.readLine()) != null);{
				//System.out.println(line);
				
				//print coloumn wise format
				String[] value = line.split(",");
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//if not read the file throw exception IO
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try {
		BufferedWriter bf = new BufferedWriter(
				new FileWriter( "C:\\Users\\Acer\\Documents\\OOPsConcept\\output.txt"));
			bf.write("ABbyu\n");
			bf.write("Hellpo");
			bf.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return;
		}
		
	}
	
	

}
