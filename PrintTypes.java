package week1;

public class PrintTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWithoutNewline();
		System.out.println();
		printWithNewline();
	}
	

		private static void printWithNewline() {
			System.out.println("Print Statements with New line:");
			System.out.println("Hope You are doing Well");
			System.out.println("All the best");
		}
		
		
		private static void printWithoutNewline() {
			System.out.println("Print Statements without New line:");
			System.out.print("Hello welcome to java class"+" ");
			System.out.print("Today");
			System.out.println();
		}
		
		

}
