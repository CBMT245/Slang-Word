import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static ArrayList<String> list = new ArrayList<String>();
	static HashMap<String, String> slang = new HashMap<String,String>();
	static ArrayList<String> history = new ArrayList<String>();
	public static void main(String[] args) {
		
		Input();
	//	Scanner scanner = new Scanner(System.in);
	//	String data = scanner.nextLine();
	//	String data = scanner.nextLine();
	//	System.out.println(slang);
	//	System.out.println(slang.get(data));
	//	searchWord(data);
		System.out.println(list.size());
		System.out.println(slang.size());
		for (String S: slang.keySet()) {
			System.out.println(S);
		}
	//	resetSlangWord();
		
		
		
		
		list.clear();
		slang.clear();
		history.clear();
	//	System.out.println(list.size());
	//	System.out.println(slang.size());
	}
	//Xong
	
	public static void historyWord(String key) {
		boolean check = slang.containsKey(key);
		if (check) history.add(key);
	}
	public static void printHistory() {
		for (int i = 0; i < history.size(); i++) {
			String key = history.get(i);
			System.out.println(key + " meaning " + slang.get(key));
		}
	}
	//Xong
	public static void searchByKey(String key) {
		boolean check = slang.containsKey(key);
		if (!check) 
			System.out.println("Not found the word in dictionary!");
		else
		System.out.println(slang.get(key));
	}
	//Xong
	public static void addWord(String key, String def) {
		boolean check = slang.containsKey(key);
		if (!check) 
			System.out.println("Not found the word in dictionary!");
		else
			slang.put(key, def);
	}
	//Xong
	public static void deleteWord(String key) {
		boolean check = slang.containsKey(key);
		if (!check) 
			System.out.println("Not found the word in dictionary!");
		else {
			System.out.println("Are you want to delete this word?\nPress Y will delete this word for good\nPress any key else will stop this function");
			Scanner scanner = new Scanner (System.in);
			String del  = scanner.nextLine();
			if (del == "Y") 
				slang.remove(key);
			else 
				System.out.println("Function canceled!");
				
		}
	}
	
	public static void randomWord() {
		Random rand = new Random();
		int num = rand.nextInt(slang.size());
		int count = 0;
		for (String key: slang.keySet()) {
			count++;
			if (count == num) {
			//	System.out.println("Slang word of the day")
				System.out.println("Slang word of the day: " +key + " meaning " + slang.get(key));
				break;
			}
		}
	}
	
	public static void searchByDef() {
		
	}
	
	public static void quizKey() {
		Random rand = new Random();
		int[] num = {0, 0, 0, 0};
		for (int i = 0; i < 4; i++) {
			boolean ok1 = true;
			while (ok1) {
				num[i] = rand.nextInt(slang.size());
				boolean ok2 = false;
				for (int j = i - 1; j >= 0; j--) {
					if (num[i] == num[j]) { 
						ok2 = true;
						break;
					}
				}
				ok1 = ok2;
			}
		}
		
	
	}
	
	
	public static void editWord(String key, String def) {
		boolean check = slang.containsKey(key);
		if (!check) 
			System.out.println("Not found the word in dictionary!");
		else {
			slang.put(key, def);
		}
	}
	//Xong
	public static void resetSlangWord() {
		slang.clear();
	//	System.out.println(list.size());
		System.out.println(slang.size());
		for (int i = 0; i < list.size(); i++) {
			String line = list.get(i);
			String[] parts = line.split("`");
			slang.put(parts[0], parts[1]);
		}
	//	System.out.println(list.size());
		System.out.println(slang.size());
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



