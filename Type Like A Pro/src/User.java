import java.util.Date;
import java.util.Scanner;

public class User {
	
	private String userName;
	private String usrInput;
	private Date date = new Date();
	private DataConfig data = new DataConfig();
	private gameResults rst = new gameResults();
	private String word;
	
	public User()
	{
		word = data.generateWord();
		
	}
	
	public User(String userName)
	{
		this.userName = userName;
		//word = data.generateWord();

	}
	
	
	
	
	public String getInput()
	{
		///word = data.generateWord();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the above word : ");
		usrInput = scan.nextLine();
		return usrInput;
		
		
	}
	
	public void setName(String userName)
	{
		this.userName = userName;
		
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	

}
