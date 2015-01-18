
public class compressString {

	public static void main(String[] args) {
		String inputString = "aabcdaeeetttzzzzzzddds";
		String outputString;
		callCS check = new callCS();
		outputString = check.findCS(inputString);
		if(outputString==null){
			System.out.println("The compressed string is not less than the original string. Hence,");
			System.out.println(inputString);
		}
		else
		{
			System.out.println("The Compressed string is:");
			System.out.println(outputString);
		}
	}
}

class callCS{
	String findCS(String list){
		String newlist = new String();
		int counter1=0,charCount=0;
		char charValue;
		for(counter1=0;counter1<list.length();counter1++){
			charValue = list.charAt(counter1);
			newlist+=charValue;
			charCount = 0;
			while(counter1<list.length()){
				if(list.charAt(counter1)==charValue)
					charCount++;
				else
					break;
				counter1++;
			}
			counter1--;
			newlist+=charCount;
		}
		if(newlist.length()>=list.length())
			return null;
		else
			return newlist;
	}
}
