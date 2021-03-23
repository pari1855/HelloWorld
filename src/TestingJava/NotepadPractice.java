package TestingJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotepadPractice {
		public static String[] word;
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\Documents\\Doc.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st = br.readLine())!=null) {
			word = st.split(" ");
				//for(String i:word)
					//System.out.println(i);
	}
		System.out.println(word[1]);
	}
} 
