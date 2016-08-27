import java.util.Scanner;

public class seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		num1=scan.nextInt();
		int n1=num;
		int res=1;
		while(n1!=0)
		{
			int t=n1%10;
			res=res*t;
			n1=n1/10;
		}
		res=res*num;
		if(res==num1)
			System.out.println("seed");
		else
			System.out.println("no seed");
	}

}
