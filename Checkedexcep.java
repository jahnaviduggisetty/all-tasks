
public class Checkedexcep {
import java.util.*;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = Arrays.asList("8984682345","8727486967","9585805695");

	 	public boolean validnumber(String s) throws NumberNotFoundException{
	 		if (arr.contains(s)){
	            throw new NumberNotFoundException("Number already exists");
	            	
	 		}
	        else{
	            return true;
	        }

	}

}
