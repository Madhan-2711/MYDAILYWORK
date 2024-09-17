package inheritance;

public class File1 implements Runnable{
	
	
	private String name;
	private int maxNum;
	
	
	public File1(String name , int maxNum) {
		this.name = name;
		this.maxNum = maxNum;
	}
	
	public void run() {
		for(int i = 0; i<maxNum ; i++) {
		System.out.println(name + "printing:" + i);
		}
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}
		
	}
	
}
