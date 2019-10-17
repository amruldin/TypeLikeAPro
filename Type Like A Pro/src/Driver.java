

public class Driver {

	public static void main(String[] args) {
		
		String input;
		
		User usr = new User();
		gameResults result = new gameResults();
		DataConfig data = new DataConfig();
		
		
		String word = data.generateWord();
		System.out.println("\n\n************ \t " + word + " \t*****************\n\n");
		input= usr.getInput();
		
		result.check(input, word);
		System.out.println(result.getScore());
		
		
		
		
	
	
		
		
		
	
		


	}

}
