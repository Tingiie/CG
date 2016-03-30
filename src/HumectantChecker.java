import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HumectantChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert ingredients to check if it's a humectant");

		while (true) {
			String ingredient = sc.nextLine();
			ingredient = ingredient.toLowerCase();
			File file = new File("Humectants.txt");
			Parser parser = new Parser(file);
			ArrayList<String> humectants = parser.parse();

			if (humectants.contains(ingredient)) {
				System.out.println("This ingredient is a humectant: " + ingredient);
			} else {
				System.out.println(ingredient + " is not a humectant");

			}
		}
	}
}
