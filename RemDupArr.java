package week1tasks;

public class RemDupArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,3,4,4,5,6,6};
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i<a.length;i++) {
			if (sb.toString().contains(String.valueOf(a[i]))) {
				continue;
			}
			else {
				sb.append(a[i]);
				sb.append(" ");
			}
		}
		
		
		
		
		System.out.println(sb);
	}

}
