package com.w3epic.wiprotraining;

public class WeightOfString {
	
	public static int getWeightOfString(String input1, int input2) {
		int weight = 0;
		
		// A=65, Z=90; a=97, z=122
		//System.out.printf("%c\n", 122);
		
		for (int i = 0; i < input1.length(); i++) {
			char letter = input1.charAt(i);
			
			if (input2 == 0) {
				if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
					letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
					continue;
				}
			}
			
			if (letter >= 65 && letter <= 90) { // A-Z
				weight += letter - 64;
				//System.out.printf(Integer.toString(letter - 64) + " ");
			} else if (letter >= 97 && letter <= 122) { // a-z
				weight += letter - 96;
				//System.out.printf(Integer.toString(letter - 96) + " ");
			} 
		}
		
		return weight;
	}

	public static void main(String[] args) {
		System.out.println(getWeightOfString("Hello World!!", 0));
		//System.out.println(getWeightOfString("abcdefghijklmnopqrstuvwxyz", 1));

	}

}
