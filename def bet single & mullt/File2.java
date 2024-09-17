package inheritance;

public class File2 {

	public static void main(String[] args) {
		System.out.println("Single Thread Execution:");
		File1 f= new File1("Single", 5);
		f.run();
	}
}
