import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class StoreCredit {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("A-large-practice.in"));
		int[] data=new int[2100];
		int N=sc.nextInt();
		FileOutputStream fs = new FileOutputStream(new File("115.txt"));
		PrintStream p = new PrintStream(fs);
		for(int i=1;i<=N;i++){
			int credit= sc.nextInt();
			int items=sc.nextInt();
			for(int j=1;j<=items;j++){
				data[j]=sc.nextInt();
			}
			
			for(int m=1;m<items;m++){
				for(int n=m+1;n<=items;n++){
					if(data[m]+data[n]==credit){
						p.println("Case #"+i+":"+" "+m+" "+n);
					}
				}
			}
		}
		
		sc.close();
		p.close();
	}
}
