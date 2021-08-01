package week1tasks;
import java.util.*;

public class OddEvenLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		change(s);

	}
	
	public static void change(String s) {
		
		StringBuilder sb = new StringBuilder();
		String str[]=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].length()%2==0) {
				sb.append(" ");
				sb.append(str[i].substring(0,str[i].length()-1)).append(Character.toUpperCase(str[i].charAt(str[i].length()-1)));
				
			}
			else {
				sb.append(" ");
				int mid = str[i].length()/2;
				sb.append(str[i].substring(0,mid)).append(Character.toUpperCase(str[i].charAt(mid))).append(str[i].substring(mid+1));
			}
		}
		System.out.println(sb.toString().trim());
		
	}

	}
