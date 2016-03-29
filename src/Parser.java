import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	private BufferedReader reader;
	private File file;
	
	public Parser(File file) throws FileNotFoundException {
		this.file = file;
		FileReader fileReader = new FileReader(file);
		reader = new BufferedReader(fileReader);
	}
	
	public ArrayList<String> parse() throws IOException{
		String humectant;
		ArrayList<String> humectants = new ArrayList<String>();
		while((humectant = reader.readLine()) != null){
			humectants.add(humectant);			
		}
		
		reader.close();
		return humectants;
	}
}
