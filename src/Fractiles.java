import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Fractiles {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("D-large.in"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("119.txt"));
		PrintStream p = new PrintStream(fs);
		for(int i=1;i<=N;i++){//K^C<10^18
			int Ktitles=sc.nextInt();
			int Complexity=sc.nextInt();
			int Students=sc.nextInt();
			BigInteger base=new BigInteger(""+Ktitles);
			BigInteger kc=base.pow(Complexity);
			System.out.println("title"+": "+Ktitles);
			System.out.println("complexity"+": "+Complexity);
			System.out.println("Students"+": "+Students);
			//long totitles=(long)Math.pow(Ktitles, Complexity);
			if(Students==Ktitles){
				p.print("Case #"+i+": ");
				System.out.print("Case #"+i+": ");
				for(int j=1;j<=Ktitles;j++){
					p.print(j+" ");
					System.out.print(j+" ");
				}
				p.println();
				System.out.println();
			}
			else if(Complexity==1){
				p.print("Case #"+i+": ");
				System.out.print("Case #"+i+": ");
				p.println("IMPOSSIBLE");
				System.out.println("IMPOSSIBLE");
			}
			else if(Ktitles==3&&Students==2){
				p.print("Case #"+i+": ");
				System.out.print("Case #"+i+": ");
				for(int j=2;j<=Ktitles;j++){
					p.print(j+" ");
					System.out.print(j+" ");
				}
				p.println();
				System.out.println();
			}
			else if(Ktitles>3){
				p.print("Case #"+i+": ");
				System.out.print("Case #"+i+": ");
				for(int j=2;j<=Students;j++){
					p.print(j+" ");
					System.out.print(j+" ");
				}
				p.print(kc.subtract(BigInteger.ONE));
				p.println();
				System.out.print(kc.subtract(BigInteger.ONE));
				System.out.println();
			}
			else{
				p.print("Case #"+i+": ");
				System.out.print("Case #"+i+": ");
				p.println("IMPOSSIBLE");
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}
