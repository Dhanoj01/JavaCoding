package String;

public class ReverseString {

	public static String Reverse(String str) {
		
		if(str == null)
		{
			throw new IllegalArgumentException("Null is not a valid input");
			
		}
		
		
		StringBuilder sb = new StringBuilder();
		
		char[] ch = str.toCharArray(); 
		
		for(int i=ch.length-1 ; i>=0 ; i--) {
			
			sb.append(ch[i]);
			
		}
		
		return sb.toString();
	}
	
	
	public static void main(String args[]) {
		
		String str = "Manoj";
		System.out.println(Reverse(str));
	}
}
