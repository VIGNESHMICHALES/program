

import java.util.Scanner;

public class arrayy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		char a1[]=str.toCharArray();
		int in1[]=new int[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			in1[i]=Character.getNumericValue(a1[i]);
		}
		for(int i=0;i<a1.length;i++)
		{
			if(in1[i]==i)
			{
				System.out.print(i+" ");
			}
		}
	}

}
