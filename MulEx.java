package inheritance;

public class MulEx {

	static String str;
	
	
	public static void main(String[] args) {
	
		try {
			int n = 29/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			int n[] = {12,43,4,3,};
			System.out.println(n[10]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			
			System.out.println(str.charAt(0));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	
	}
}
