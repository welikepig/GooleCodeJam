import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class bffs {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("11112.txt");
		Scanner sc = new Scanner(new FileReader("11112.txt"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("203.txt"));
		PrintStream p = new PrintStream(fs);
		HashSet<String> set=new HashSet<>();
		ArrayList<Integer> circles = new ArrayList<>();
		loop:for(int i=1;i<=N;i++){
			int kids=sc.nextInt();
			System.out.println(kids);
			int[] child=new int[kids+1];
			int[] temp=new int[kids+1];
			boolean[] childtake=new boolean[kids+1];
			int maxvalue=0;
			set=new HashSet<>();
			for(int j=1;j<=kids;j++){
				int v=sc.nextInt();

				child[j]=v;
			}

			for(int k=1;k<=kids;k++){
				childtake=new boolean[kids+1];
				circles.clear();
				int kid=k;
				int count=0;
				while(childtake[kid]==false){
					circles.add(kid);
					childtake[kid]=true;
					kid=child[kid];
					count++;
				}
				if(kid==k){
					if(count>maxvalue){
						maxvalue=count;
					}
				}
			}
			childtake=new boolean[kids+1];
			temp=new int[kids+1];
			for(int jj=1;jj<=kids;jj++){
				for(int ii=1;ii<=kids;ii++){
					if(child[child[ii]]!=ii){
						if(temp[ii]+1>temp[child[ii]]){
							temp[child[ii]]=temp[ii]+1;
						}
					}
				}
			}
			for(int k=0;k<temp.length;k++){
				System.out.print(temp[k]+"  ");
			}
			System.out.println();
			int ans2=0;
			for(int k=1;k<=kids;k++){
				if(!childtake[k]&&child[child[k]]==k){
					ans2+=2+ temp[k]+temp[child[k]];
					System.out.println("ans2:"+ans2);
					childtake[k]=childtake[child[k]]=true;
				}
			}
			if(ans2>maxvalue){
				maxvalue=ans2;
			}
			System.out.println("Case #"+i+": "+maxvalue);
			p.println("Case #"+i+": "+maxvalue);
		}
	}
}
