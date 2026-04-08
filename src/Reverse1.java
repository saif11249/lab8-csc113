
public class Reverse1 {

	public static void Reverse(String str , int len) {
		
		if (len <= 0) {
			return;
		}
			System.out.print(str.charAt(len-1));
			
		
		Reverse(str , len -1);
			
		}
}
