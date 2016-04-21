import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class C {

	public void run() {
		try {
			BufferedReader buff = new BufferedReader(new FileReader(new File("C-small-practice.in")));
			
			int[] buttons = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
			int[] numbers = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
			int tests = Integer.parseInt(buff.readLine());
			for (int i = 0; i < tests; i++) {
				String line = buff.readLine();
				String ret = "";
				for (int j = 0; j < line.length(); j++) {
					if (j != 0 && line.charAt(j-1) == ' ' && line.charAt(j) == ' ') {
						ret += " ";
					}
					if (line.charAt(j) == ' ') {
						ret += "0";
						continue;
					}
					
					if (j != 0 && line.charAt(j-1) != ' ' && buttons[line.charAt(j-1) - 'a'] == buttons[line.charAt(j) -'a']) {
						ret += " ";
					}
					
					int index = line.charAt(j) - 'a';
					
					for (int k = 0; k < numbers[index]; k++) {
						ret += buttons[index];
					}
					
				}
				
				ret = ret.trim();
				System.out.println("Case #" + (i+1) + ": " + ret);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new C().run();
	}
}
