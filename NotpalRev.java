package week1tasks;
import java.util.Scanner;
import java.util.Arrays;
public class NotpalRev {
public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		wordrev(s);

}
public static void wordrev(String s) {
	String[] st = s.split(" ");
	for(int i =0;i<st.length;i++) {
		isPal(st[i]);	
	}
}


public static void isPal(String s){
	StringBuilder sb = new StringBuilder(s);
	if (!sb.toString().equals(sb.reverse().toString())) {  
		System.out.print(sb.toString());
		System.out.print(" ");
	}
	else {
		System.out.print(sb.toString());
		System.out.print(" ");
	}
}
}