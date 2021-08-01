
package week1tasks;
import java.util.Scanner;

public class LastUpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		last(s);

	}
	
	public static void last(String s) {
		String st[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < st.length; i++) {
			sb.append(st[i].substring(0,st[i].length()-1)).append(Character.toUpperCase(st[i].charAt(st[i].length()-1))).append(" ");
			
		}
		System.out.println(sb.toString().trim());
	}

	


}
