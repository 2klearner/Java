package week1;

public class StringMethods {
	public static void main(String[]args) {
		String name1="Chennai";
		String name2="City";
		
		//concat
		System.out.println(name1.concat(" "+name2));
		System.out.println();
		
		//uppercase
		String name3="Internship";
		System.out.println(name3.toUpperCase());
		System.out.println();
		
		//lowercase
		String name4="INSPECTION";
		System.out.println(name4.toLowerCase());
		System.out.println();
		
		//startswith
		
		String name5="computer";
		System.out.println(name5.startsWith("ab"));
		System.out.println();
		
		//endswith
		String name6="computer";
		System.out.println(name6.startsWith("er"));
		System.out.println();
		
		
	}

}
