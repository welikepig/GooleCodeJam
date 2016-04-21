import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class spelling {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("C-large-practice.in"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("116.txt"));
		PrintStream p = new PrintStream(fs);
		for(int i=1;i<=N;i++){
			String str=sc.nextLine();
			System.out.println(str);
			char[] letters=str.toCharArray();
			int lastnum=1;
			str="";
			for(char c:letters){
				int num;
				switch(c){
				case'a':
					num=2;
					if(lastnum==num){
						str+=" 2";
					}
					else
						str+="2";
					lastnum=num;
					continue;
				case'b':
					num=2;
					if(lastnum==num){
						str+=" 22";
					}
					else
						str+="22";
					lastnum=num;
					continue;
				case'c':
					num=2;
					if(lastnum==num){
						str+=" 222";
					}
					else
						str+="222";
					lastnum=num;
					continue;
				case'd':
					num=3;
					if(lastnum==num){
						str+=" 3";
					}
					else
						str+="3";
					lastnum=num;
					continue;
				case'e':
					num=3;
					if(lastnum==num){
						str+=" 33";
					}
					else
						str+="33";
					lastnum=num;
					continue;
				case'f':
					num=3;
					if(lastnum==num){
						str+=" 333";
					}
					else
						str+="333";
					lastnum=num;
					continue;
				case'g':
					num=4;
					if(lastnum==num){
						str+=" 4";
					}
					else
						str+="4";
					lastnum=num;
					continue;
				case'h':
					num=4;
					if(lastnum==num){
						str+=" 44";
					}
					else
						str+="44";
					lastnum=num;
					continue;
				case'i':
					num=4;
					if(lastnum==num){
						str+=" 444";
					}
					else
						str+="444";
					lastnum=num;
					continue;
				case'j':
					num=5;
					if(lastnum==num){
						str+=" 5";
					}
					else
						str+="5";
					lastnum=num;
					continue;
				case'k':
					num=5;
					if(lastnum==num){
						str+=" 55";
					}
					else
						str+="55";
					lastnum=num;
					continue;
				case'l':
					num=5;
					if(lastnum==num){
						str+=" 555";
					}
					else
						str+="555";
					lastnum=num;
					continue;
				case'm':
					num=6;
					if(lastnum==num){
						str+=" 6";
					}
					else
						str+="6";
					lastnum=num;
					continue;
				case'n':
					num=6;
					if(lastnum==num){
						str+=" 66";
					}
					else
						str+="66";
					lastnum=num;
					continue;
				case'o':
					num=6;
					if(lastnum==num){
						str+=" 666";
					}
					else
						str+="666";
					lastnum=num;
					continue;
				case'p':
					num=7;
					if(lastnum==num){
						str+=" 7";
					}
					else
						str+="7";
					lastnum=num;
					continue;
				case'q':
					num=7;
					if(lastnum==num){
						str+=" 77";
					}
					else
						str+="77";
					lastnum=num;
					continue;
				case'r':
					num=7;
					if(lastnum==num){
						str+=" 777";
					}
					else
						str+="777";
					lastnum=num;
					continue;
				case's':
					num=7;
					if(lastnum==num){
						str+=" 7777";
					}
					else
						str+="7777";
					lastnum=num;
					continue;
				case't':
					num=8;
					if(lastnum==num){
						str+=" 8";
					}
					else
						str+="8";
					lastnum=num;
					continue;
				case'u':
					num=8;
					if(lastnum==num){
						str+=" 88";
					}
					else
						str+="88";
					lastnum=num;
					continue;
				case'v':
					num=8;
					if(lastnum==num){
						str+=" 888";
					}
					else
						str+="888";
					lastnum=num;
					continue;
				case'w':
					num=9;
					if(lastnum==num){
						str+=" 9";
					}
					else
						str+="9";
					lastnum=num;
					continue;
				case'x':
					num=9;
					if(lastnum==num){
						str+=" 99";
					}
					else
						str+="99";
					lastnum=num;
					continue;
				case'y':
					num=9;
					if(lastnum==num){
						str+=" 999";
					}
					else
						str+="999";
					lastnum=num;
					continue;
				case'z':
					num=9;
					if(lastnum==num){
						str+=" 9999";
					}
					else
						str+="9999";
					lastnum=num;
					continue;
				case' ':
					num=0;
					if(lastnum==num){
						str+=" 0";
					}
					else
						str+="0";
					lastnum=num;
					continue;
				}	
			}
			System.out.println(str);
			p.println("Case #"+(i)+": "+str);
		}
	}
}
