package com.w3epic.wiprotraining;

public class MostFrequentDigit {
	
	public static int getMostFrequestDigit(int input1, int input2, int input3, int input4) {
		String allNo = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] digitFrequency = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 0-9
		
		for (int i = 0; i < allNo.length(); i++) {
			digitFrequency[Integer.parseInt(String.valueOf(allNo.charAt(i)))]++;
		}
		
		int mostFrequentDigit = 0;
		
		for (int i = 0; i <= 9; i++) {
			mostFrequentDigit 	= digitFrequency[i] >= digitFrequency[mostFrequentDigit] ? i : mostFrequentDigit;
		}
		
		return mostFrequentDigit;
	}

	public static void main(String[] args) {
		System.out.println(getMostFrequestDigit(123, 456, 345, 5043));

	}

}
