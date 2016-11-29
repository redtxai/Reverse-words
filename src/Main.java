import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {
		String fileName = args[0];
		String line;
		try (
		    InputStream fis = new FileInputStream(fileName);
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		) {
			String text = "";
		    while ((line = br.readLine()) != null) {
		    	if (!line.trim().isEmpty()) {
		    		String[] tokens = line.split(" ");
		    		for (int j = tokens.length-1; j >= (1); j--) {
		    			text += tokens[j] + " ";
		    		}
		    		text += tokens[0];
		    		System.out.println(text);
		    		text = "";
		    	}
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
