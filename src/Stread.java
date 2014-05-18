import java.util.Random;

public class Stread implements Runnable {
	String name;
	int time;
	Random r = Random();
	
	public Title (String s){
		name = s;
		time = r.nextInt(999);
	}
	public void run(){
		try{
		System.out.printf("%s is sleeping for %d\n, name, time");
		Thread.sleep(time);
		System.out.printf("%s is done ", name);
		}catch (Exception e) {};
		
	}

}
