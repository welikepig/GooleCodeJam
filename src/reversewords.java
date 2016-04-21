import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class reversewords {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("B-large-practice.in"));
		int[] data=new int[2100];
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("115.txt"));
		PrintStream p = new PrintStream(fs);
		for(int i=1;i<=N;i++){
			String str=sc.nextLine();
			char[] letters=str.toCharArray();
			str="";
			String newstr="";
			for(char c:letters){
				if(c==' '){
					newstr=str+" "+newstr;
					str="";
					continue;
				}
				else{
					str+=c;
					continue;
				}
			}
			newstr=str+" "+newstr;
			p.println("Case #"+i+": "+newstr);
		}
	}
}
