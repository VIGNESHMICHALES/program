mport java.util.Scanner;


public class Holiday1 {

	public static void main(String[] args) {
		String workingday;
		String str1="sunday";
		String str2="monday";
		String str3="tuesday";
		String str4="wednesday";
		String str5="thursday";
		String str6="friday";
		String str7="saturday";
		Scanner input=new Scanner(System.in);
		System.out.println("enter the day");
		workingday=input.nextLine();
		if(workingday.equalsIgnoreCase(str2) ||workingday.equalsIgnoreCase(str3)||workingday.equalsIgnoreCase(str4)||workingday.equalsIgnoreCase(str5)||workingday.equalsIgnoreCase(str6)||workingday.equalsIgnoreCase(str7)){
			System.out.println("true");
			}
		else{
			System.out.println("false");
					}
				}
			}
