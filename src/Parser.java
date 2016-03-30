import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	private BufferedReader reader;
	
	public Parser(File file)  {
			try {
				reader = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public ArrayList<String> parse() {
		String humectant;
		ArrayList<String> humectants = new ArrayList<String>();
			try {
				while((humectant = reader.readLine()) != null){
					humectants.add(humectant);			
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return humectants;
	}
}
