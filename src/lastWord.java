import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class lastWord {
	public static void main(String[] args) throws IOException {
		StringBuffer sb; 
		Scanner sc = new Scanner(new FileReader("A-large (1).in"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("201.txt"));
		PrintStream p = new PrintStream(fs);
		loop:for(int i=1;i<=N;i++){
			String s="";
			String str=sc.nextLine();
			char[] letters=str.toCharArray();
			s+=letters[0];
			for(int j=1;j<letters.length;j++){
				if(letters[j]>=s.charAt(0)){
					s=letters[j]+s;
				}
				else
					s=s+letters[j];
			}
			p.println("Case #"+i+": "+s);
			System.out.println("Case #"+i+": "+s);
		}
		
	}
}
