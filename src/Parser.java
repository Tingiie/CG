import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	private BufferedReader reader;
	private ArrayList<String> humectantList;

	public Parser(File file) {
		humectantList = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> parse() {
		String humectant;
		try {
			while ((humectant = reader.readLine()) != null) {
				humectantList.add(humectant);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return humectantList;
	}

	public String listAll() {
		if (!humectantList.isEmpty()) {
			StringBuilder list = new StringBuilder();

			for (int i = 0; i < humectantList.size(); i++) {
				list.append((humectantList.get(i) + "\n"));
			}
			return list.toString();
		} else {
			return "Empty list";
		}
	}
}
