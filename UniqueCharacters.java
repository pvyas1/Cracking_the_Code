
public class UniqueCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "abcdefgh";
		String input2 = "abackjsnf";
		Boolean Result;
		UC temp = new UC();
		Result = temp.checkUnique(input2);
		System.out.println("Result: "+Result);
		if(Result == true)
			System.out.println("The characters entered are unique");
		else
			System.out.println("The characters are not unique");
	}
	
}	
class UC{
	//Function for Checking Unique characters
		Boolean checkUnique(String given){
			for(int i=0;i<given.length();i++){
				for(int j=i+1;j<given.length();j++){
					if(given.charAt(i) == given.charAt(j)){
						return false;
					}
				}
			}
				return true;
		}
}
