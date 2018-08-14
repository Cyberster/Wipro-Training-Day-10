package com.w3epic.wiprotraining;

public class SecondWordInUppercase {
	public static String getSecondWordInUppercase(String input1) {
		if (input1.equals("")) return "LESS";
		
		StringBuffer sb = new StringBuffer(input1.trim());
		
		try {
			int startIndex = sb.indexOf(" ");
			if (startIndex == -1) return "LESS";
			
			try {
				int endIndex = sb.indexOf(" ", startIndex+1) + 1;
				return sb.substring(startIndex+1, endIndex).toUpperCase().trim();
			} catch (StringIndexOutOfBoundsException e) {
				//System.out.println(e.getMessage());
				return sb.substring(startIndex+1).toUpperCase().trim();
			}
		} catch (StringIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			return "LESS";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getSecondWordInUppercase("hello"));
	}
}
