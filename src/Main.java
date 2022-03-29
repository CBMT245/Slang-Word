import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("slang.txt"));
			String line; 
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			String tempt;
			tempt = list.get(i);
			System.out.println(tempt);
		}
		System.out.println(list.size());
	}

}
