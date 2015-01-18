
public class ReplaceSpace {
	public static void main(String[] args){
		String UserS = "I am from India,country in Asia.";
		char[] stringArr = new char[50];
		char[] finalStrArr = new char[50];
		int i=0,j=0;
		repstr Check = new repstr();
		//stringArr = UserS.toCharArray();
		for(j=0;j<UserS.length();j++){
			stringArr[j]=UserS.charAt(j);
		}
		System.out.println("Old String is as follows:");
		System.out.print("\"");
		while(i < stringArr.length)
		{
			System.out.print(stringArr[i]);
			i++;
		}
		System.out.println("\"");
		//System.out.println("\nstringArr[15]: "+stringArr[15]);
		finalStrArr = Check.replace(stringArr,UserS.length());
		i=0;
		System.out.println("\nNew String is as follows:");
		System.out.print("\"");
		while(i < finalStrArr.length)
		{
			System.out.print(finalStrArr[i]);
			i++;
		}
		System.out.println("\"");
		
		/*-------------
		//Checking the pass by ref of the char[] 
		i=0;
		System.out.println("Again Old String is as follows:");
		System.out.print("\"");
		while(i < stringArr.length)
		{
			System.out.print(stringArr[i]);
			i++;
		}
		System.out.println("\"");

		 -----------------*/
	}

}
class repstr{
	char[] replace(char[] str,int len){
		int i=0,j=0,estLen=0,CountSpace=0;
		//System.out.println("\nstr: Length: "+str.length);
		//return 0;
		while(i<len){
			if(str[i]==' ')
				CountSpace++;
			i++;
		}
		estLen = (CountSpace*2)+len;
		if(estLen>str.length)
			System.out.println("Length of the final string would go out of bound");
		else
		{
			i=0;
			while(i < estLen){
				if(str[i]==' '){
					str[i]='%';
					for(j=estLen;j>(i+2);j--){
						str[j]=str[j-2];
					}
					str[++i]='2';
					str[++i]='0';
				}
				i++;
			}
		}
		return str;
	}
}
