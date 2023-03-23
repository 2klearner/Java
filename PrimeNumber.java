package week1;

public class PrimeNumber {
	
	public static boolean isPrime(int numberToCheck) {
		for(int divide=2;divide<numberToCheck;divide++) {
			if(numberToCheck%divide==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for (int numberToCheck=2;numberToCheck<100;numberToCheck++) {
			if (isPrime(numberToCheck)){
				System.out.println(numberToCheck);
			}
		}
		
	

	}

}
