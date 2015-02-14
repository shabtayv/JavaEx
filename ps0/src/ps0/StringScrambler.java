package ps0;

public class StringScrambler {

	public String reverseWordOrder(String input) {
		if (input == null) {
			return null;
		}
		
		String reversedWord = "";
		String[] words = input.split(" ");
		int i = words.length - 1;
		while (i > 0) {
			reversedWord = reversedWord + words[i] + " ";
			i--;
		}
		reversedWord = reversedWord + words[i];

		return reversedWord;
	}


	public static void main(String args[]) {
		StringScrambler scrambler = new StringScrambler();
		String input;
		String output;

		input = "To be or not to be, that is the question.";
		output = scrambler.reverseWordOrder(input);
		System.out.println(output);

		input = "Stressed spelled backwards is Desserts";
		output = scrambler.reverseWordOrder(input);
		System.out.println("\n\n" + output);
	}

}
