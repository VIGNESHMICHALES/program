import java.util.Scanner;


public class RerseArray7{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int k=sc.nextInt();
	int a[]=new int[len];
	int i;
	
for(i=len-k;i<=len-1;i++){
	a[i]=sc.nextInt();
	
}
for( i=0;i<len-k;i++){
	a[i]=sc.nextInt();
	}
for(int m:a){
	System.out.println(m);
}
}}
