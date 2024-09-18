package digitalRoot;

//	Digital root is the recursive sum of all the digits in a nber.
//	
//	Given n, take the sum of the digits of n. If that value has more than one digit, 
//	continue reducing in this way until a single-digit nber is produced. The input will be a non-negative integer.
//	
//	Examples
//	    16  -->  1 + 6 = 7
//	   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//	132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//	493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
public class Solution {
	public static void main(String[] args) {
		DigitalRoot.getDigitalRoot(16);
		DigitalRoot.getDigitalRoot(942);
		DigitalRoot.getDigitalRoot(132189);
		DigitalRoot.getDigitalRoot(493193);
	}

	
}

class DigitalRoot {
	public static int getDigitalRoot(int n) {
		if(n < 10) 
			return n;
		char[] charset = Integer.toString(n).toCharArray();
		int sum = 0;
		for(int i = 0 ; i < charset.length ; i++) {
			sum += Character.getNumericValue(charset[i]);
		}
		if(sum < 10) 
			return sum;
		else
			return getDigitalRoot(sum);
	}
}
