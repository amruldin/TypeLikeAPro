import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class DataConfig {
	
	private String list[] = null;
	protected String word;

	public DataConfig()
	{
		
	}
	// Create words from a file
	public void createWords()
	{
		String fileName = "words";
		int count = 0;
		int k = 0;
		
		
		try
		{
			File file = new File("words");
			Scanner data = new Scanner(file);
			Scanner page = new Scanner(file);
			
			
			// Count the length of the array
			while(data.hasNextLine())
			{
				count++;
				String content = data.next();
			}
			
			// Initialize the array
			list = new String[(count)];
			
			// add data from the page to the array
			while(page.hasNextLine())
			{

				String cont = page.next();
				list[k] =  cont;
				k++;
				//System.out.println(cont);
				
				
			}
			
			// close the file
			data.close();
			
			
		}
		catch (FileNotFoundException e )
		{
			
			System.out.println("File not found!");
		}
		
		
	}
	
	
	public String generateWord()
	{
		createWords();
		int pos;
		Random rnd = new Random();
		String word;
		pos = rnd.nextInt(list.length);
		word = list[pos];
		return word;
	}
	
	
	

}
