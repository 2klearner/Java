package week1;

import java.util.Arrays;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compareTo
		String var1="abishek";
		String var2="sandeep";
		System.out.println(var1.compareTo(var2));
		
		
		//trim
		String myString=" Edubridge";
		System.out.println(myString);
		System.out.println(myString.trim());
		
		
		//strip
		String myString1=" Learning ";
		System.out.println(myString1);
		System.out.println(myString1.strip());
		
		
		String str2="abishek";
		char[] destbo=new char[7];
		str2.getChars(0,7,destbo,0);
		System.out.println(Arrays.toString(destbo));

	}

}
