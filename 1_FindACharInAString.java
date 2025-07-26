import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		String name = "Visitors, this is a string consisting words & symbols!!"; 
		char target = '!';

		//Conversion of String to Array
		System.out.println(Arrays.toString(name.toCharArray()));      
		//Calling search
		System.out.println(search(name,target));
	}   


// Search function
static boolean search( String str , char ch){
		
		for( char chara : str.toCharArray())
		{
			if ( chara == ch )
			return true;
		}
		
		return false;		
	}
}
