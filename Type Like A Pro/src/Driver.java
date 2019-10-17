
/*
 * Author : Amruldin Jamalli
 * Description : Basic Typing game
 */

public class Driver {

	public static void main(String[] args) {
		
		String input;
		
		User usr = new User();
		gameResults result = new gameResults();
		DataConfig data = new DataConfig();
		
		
		while(true)
		{
			Timer time = new Timer();
			String word = data.generateWord();
			System.out.println("\n\n************ \t " + word + " \t*****************\n\n");
			input= usr.getInput();
			result.check(input, word);
			System.out.println(result.getScore());
			time.getSec();
		}
		
		
		
		
		
	
	
		
		
		
	
		


	}

}
