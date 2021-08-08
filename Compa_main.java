package abb;
import java.util.*;
public class Compa_main {
	public static <T> void main(String[] args) {
		List<Compa> pd=new ArrayList<Compa>();
		pd.add(new Compa(11, "ABC", 25f, 3.2f, 2.5f));
		pd.add(new Compa(12, "xyz", 30.5f, 4.0f, 2f));
		pd.add(new Compa(13, "pqr", 40.7f, 3.0f, 5.3f));
		pd.add(new Compa(16, "ABC", 50f, 2.4f, 4f));
		pd.add(new Compa(18, "pqr", 45.3f, 2.6f, 3f));
		pd.add(new Compa(22, "mno", 15f, 2.8f, 3.2f));
		for(Compa i:pd) {
			System.out.println(i);
		}
		Collections.sort(pd, (Compa p1, Compa p2) -> {
			Integer d1 = p1.getId();
			Integer d2 = p2.getId();
			return d1.compareTo(d2);
		});
		System.out.println("Sorting based on id");
		printProductList(pd);
		
		Collections.sort(pd, (Compa p1, Compa p2) -> {
			Float d1 = p1.getCost();
			Float d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("Sorting based on cost");
		printProductList(pd);
		
		Collections.sort(pd, (Compa p1, Compa p2) -> {
			Float f1=p1.getRating();
			Float f2=p2.getRating();
			int x=f2.compareTo(f1);
			if(x==0) {
				Float d1 = p1.getCost();
				Float d2 = p2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("Sorting based on rating");
		printProductList(pd);
	}
	public static void printProductList(List<Compa> pd) {
		for (Compa p : pd) {
			System.out.println(p);
		}
}
}