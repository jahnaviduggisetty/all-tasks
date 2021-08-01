package week1tasks;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {101,22,344,699,123,678,33};
		remv(arr);
	}
	
	public static void remv(int arr[]) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<arr.length;i++) {
			if(!digit(arr[i])) {
				sb.append(arr[i]);
				sb.append(" ");
			}
		
		}
		String s[] = sb.toString().split(" ");
		int size = s.length;
		int b[] = new int[size];
		for(int i =0;i<size;i++) {
			b[i] = Integer.parseInt(s[i]);
		}
		for(int i =0;i<b.length;i++) {
			System.out.print(s[i]+" ");
		}
	}
	
	public static Boolean digit(int n) {
		String s = String.valueOf(n);
		if (s.charAt(0)==s.charAt(s.length()-1)){
			return true;
		}
		else {
			return false;
		}
	}

}
