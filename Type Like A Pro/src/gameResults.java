import java.util.Date;
public class gameResults extends DataConfig {
	
	private int score;
	private int sec;
	
	
	
	public gameResults() {
		super();
	}

	public void check(String usrInput, String word)
	{
		if(usrInput.matches(word)) {
			score++;
			
		}
	}
	
	
	
	
	public int getScore()
	{
		return score;
		
	}
	
	

}
