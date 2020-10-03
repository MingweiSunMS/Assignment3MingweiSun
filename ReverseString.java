
public class ReverseString {

	public static String reverseString(String input) {
		String result = "";

		if (input == null || input.length() == 0) {
			System.out.println("The input is empty. Please check and retry");
		} else if (input.trim().isEmpty()) {
			System.out.println("This string is full of whitespace. Please check and retry");
		} else if (input.indexOf(' ') == -1) {
			return input;
		} else {
			input = input.trim().replaceAll(" +", " ");
			String[] wordList=input.split(" ");
			for(int i=wordList.length-1;i>0;i--) {
				result+=wordList[i]+" ";
			}
			result+=wordList[0];
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empty = "";
		reverseString(empty);

		String fullWhiteSpace = "       ";
		reverseString(fullWhiteSpace);

		String oneWord = "Hello";
		System.out.println(reverseString(oneWord));

		String test1 = "The sky is blue";
		System.out.println(reverseString(test1));
		
		String multiSpace="The     sky     is    blue";
		System.out.println(reverseString(multiSpace));

	}

}
