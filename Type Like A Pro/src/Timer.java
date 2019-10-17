import java.util.Date;

public class Timer {
	
	private Date time;
	
	
	public Timer()
	{
		time = new Date();
	}
	
	
	
	public void getSec() {
		long tm;
		tm = time.getSeconds();
		System.out.println(tm);
	}

}
