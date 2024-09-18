package codeWars_18_09_2024;

public class Solution {
	public static void main(String[] args) {
		Maskify.maskify("4556364607935616");
		Maskify.maskify("646079367616");
		Maskify.maskify("1");
		Maskify.maskify("");
	}
}

class Maskify {
	public static String maskify(String str) {

		String maskedString = "";
		char[] charWord = str.toCharArray();
		if (charWord.length > 4) {
			for (int i = 0; i < charWord.length - 4; i++) {
				charWord[i] = '#';
			}
            maskedString = new String(charWord);
			System.out.println(maskedString);
			return maskedString;
		}
		maskedString = str;
		System.out.println(maskedString);
		return maskedString;
	}
}
