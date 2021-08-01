package jahnavi;
import java.util.Scanner;
public class Secureprog {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printUrl(s);
		isSafe(s);
		

	}
	static void printUrl(String s) {
		System.out.println(s.substring(s.indexOf("www."),s.indexOf(".com")+4));
	}
	static void isSafe(String s)
	{
		String result=(s.contains("https"))? "Safe" : "NotSafe";
		System.out.println(result);
	}

}
