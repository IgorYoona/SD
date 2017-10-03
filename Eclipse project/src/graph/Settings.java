package graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;

public class Settings {
	public static int port = 8080;
	public static String ip = "localhost";
	
	public Settings(String path){
		File conf = new File(path);
		FileReader fr;
		
		try {
			fr = new FileReader(conf);

			BufferedReader br = new BufferedReader(fr);
			String buffer;
			
			buffer = br.readLine();
			String value[] = buffer.split("=");
			port = Integer.parseInt(value[1]);
			
			buffer = br.readLine();
			value = buffer.split("=");
			ip = value[1];
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}