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
		
		Input();
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
	//	String data = scanner.nextLine();
	//	System.out.println(slang);
	//	System.out.println(slang.get(data));
		searchWord(data);
		list.clear();
		slang.clear();
	}
	//Xong
	public static void searchWord(String word) {
		
		System.out.println(slang.get(word));
	}
	//Xong
	public static void addWord(String key, String def) {
		slang.put(key, def);
	}
	//Xong
	public static void deleteWord(String key) {
		boolean check = slang.containsKey(key);
		if (!check) 
			System.out.println("Not found the word in dictionary!");
		else
			slang.remove(key);
	}
	
	
	
	public static void editWord(String key) {
		
	}
	
	public static void resetSlangWord() {
		for (int i = 0; i < list.size(); i++) {
			
		}
	}
	
	public static void Input() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("slang.txt"));
			String line; 
			while ((line = reader.readLine()) != null) {
				list.add(line);
				String[] parts = line.split("`");
				slang.put(parts[0], parts[1]);
			}
			reader.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		for (int i = 0; i < list.size(); i++) {
			String tempt;
			tempt = list.get(i);
			String[] parts = tempt.split("`");
			if (parts.length == 1) System.out.println(i+1);
		//	slang.put(parts[0], parts[1]);
			//System.out.println(parts[1]);
		}
		System.out.println(list.size());
	//	System.out.println(list.get(7656));
		String tempt = list.get(7656);
		String[] test = tempt.split("`");
		System.out.println(test[0]);
		System.out.println(test[1]);
		*/
	}
	
}



