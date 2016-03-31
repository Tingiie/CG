import java.io.File;

public class TestParser {

	public static void main(String[] args) {
		File file = new File("Humectants.txt");
		Parser parser = new Parser(file);
		System.out.println("parse(): \n" + parser.parse());
		System.out.println("listAll(): \n" + parser.listAll());
		
	}
}
