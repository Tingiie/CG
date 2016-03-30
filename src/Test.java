import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		File file = new File("Humectants.txt");
		Parser parser = new Parser(file);
		System.out.println(parser.parse());
		
		
	}
}
