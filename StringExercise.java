package week1;

public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//replace()
		String str1="abc";
		System.out.println(str1.replace("ab","cd"));
		
		//equals()
		String str2="cse";
		System.out.println(str2.equals("cse"));
		
		//contains
		String str3="computer";
		String str4="co";
		
		System.out.println(str3.contains(str4));
		System.out.println(str4.contains(str3));
		
		//charAt
		String str5="learning";
		System.out.println(str5.charAt(5));
		
		//length
		System.out.println(str5.length());

	}

}
