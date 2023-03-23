package week1;

public class DeepCopy {

	public static void main(String[] args) {
		int array1[]= {12,36,60,84};
		int array2[]=new int[array1.length];
		array2=array1;
		
		System.out.println("Original Array:");
		
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
	    System.out.println("Copied Array:");
		
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}


	}

}
