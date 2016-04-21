import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;; 

public class coinJam {
	public static void main(String[] args) throws IOException {
		long starTime=System.currentTimeMillis();	
		int coun=0;
	
		int b=(int)10e6;
		boolean[] flag1 = new boolean[(b+1)];
		for(int i=3;i<=b;i+=2){
			flag1[i]=true;
		}
			flag1[2]=true;
		for(int j=3;j<=Math.sqrt(b);j+=2){	
			if (flag1[j]){
				for(int k=j*j;k<=b;k+=2*j){
					flag1[k]=false;
				}
			}
		}//Prime list
		int[] primeList=new int[664579];
		for(int i=2;i<=b;i++){
			if(flag1[i]){
				primeList[coun]=i;
				coun++;
			}
		}
		System.out.println(coun);
		
		Scanner sc = new Scanner(new FileReader("C-large.in"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("117.txt"));
		PrintStream p = new PrintStream(fs);
		Random ran =new Random();
		HashSet<String> set=new HashSet<>();
		for(int i=1;i<=N;i++){
			String str="";
			int len=sc.nextInt();
			int count=sc.nextInt();
			int count2=0;
			int[] value=new int[len];
			value[0]=1;
			value[len-1]=1;
			System.out.println("Case #"+i+": ");
			p.println("Case #"+i+": ");
			for(int Time=0;Time<=30000;Time++){
				str="";
				for(int j=0;j<len-2;j++){
					value[j+1]=ran.nextInt(2);
				}
				for(int k=0;k<value.length;k++){
					str=str+value[k];
				}
				set.add(str);
			}
			loop:for(String s:set){
				//System.out.println("another s is:"+s);
				int J=9;
				int[] memory=new int[9];
				
				char[] letters=s.toCharArray();
				loop2:for(int base=2;base<=10;base++){
					BigInteger bi=new BigInteger("0");
					BigInteger ba=new BigInteger(""+base);
					//System.out.print(bi+ "  ");
					//System.out.print(ba+ "  ");
					
					for(int location=0;location<letters.length;location++){
						if(letters[location]=='1'){
							bi=bi.add(ba.pow(letters.length-1-location));
						}
					}
					//System.out.print(bi+ "  ");
					for(int test=0;test<primeList.length;test++){
						//if(numValue==primeList[test]){
						//	continue loop;
					//	}
						BigInteger prim=new BigInteger(""+primeList[test]);
						//System.out.println(prim);
						if(bi.mod(prim)==BigInteger.ZERO){
							memory[base-2]=primeList[test];
							//System.out.println(primeList[test]);
							J--;
							if(J==0){
								System.out.print(s+" ");
								p.print(s+" ");
								for(int mem=0;mem<9;mem++){
									System.out.print(memory[mem]+" ");
									p.print(memory[mem]+" ");
								}
								System.out.println();
								p.println();
								count2++;
							}
							if(count2==count){
								break loop;
							}
							continue loop2;
						}
					}
					continue loop;
				}
			}System.out.println(count2);
		}
		
		long endTime=System.currentTimeMillis();
		long durTime = endTime-starTime;
		System.out.println(durTime/1000.0+"s");
	}
}
