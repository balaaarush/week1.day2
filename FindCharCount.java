package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "cognizantoo";
		char ch = 'o';
		int count =0;
		char[] charArray=str.toCharArray();
		System.out.println(charArray);
		for(int i=2; i<charArray.length; i++ ) {
			if(ch==charArray[i]) {
			count++;
			}
		}
		
		
System.out.println(count);
	}

}
