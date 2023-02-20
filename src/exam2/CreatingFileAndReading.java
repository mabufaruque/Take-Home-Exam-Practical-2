package exam2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CreatingFileAndReading {

	static String Path = "src\\data\\Dictionary.txt";

	public static void main(String[] args) throws IOException {

		doesFileExists(Path);

	}

	public static String doesFileExists(String path) throws IOException {

		String line = null;

		try {
			File f = new File(Path);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File does not exist.");
		}
		return line;
	}

}