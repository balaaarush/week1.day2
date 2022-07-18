package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String rs= "hello", nrs="";
	        char ch;
	       
	
	      for (int i=0; i<rs.length(); i++)
	      {
	        ch= rs.charAt(i); 
	        nrs= ch+nrs; 
	      }
	      System.out.println("Reversed word: "+ nrs);

	}

}
