import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static ArrayList<String> list = new ArrayList<String>();
	static HashMap<String, String> slang = new HashMap<String,String>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Input();
		String data = scanner.nextLine();
	//	System.out.println(slang);
		System.out.println(slang.get(data));
		
	}
	
	public void searchWord(String s) {
		
	}
	
	public static void Input() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("slang.txt"));
			String line; 
			while ((line = reader.readLine()) != null) {
				list.add(line);
			//	String[] parts = line.split("`");
			//	slang.put(parts[0], parts[1]);
			}
			reader.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < list.size(); i++) {
			String tempt;
			tempt = list.get(i);
			String[] parts = tempt.split("`");
			if (parts.length == 1) System.out.println(i+1);
		//	slang.put(parts[0], parts[1]);
			//System.out.println(parts[1]);
		}
		System.out.println(list.size());
		
	}
	
}



