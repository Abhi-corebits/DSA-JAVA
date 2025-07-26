import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		String name = "Visitors, this is a string consisting words & symbols!!"; 
		char target = '!';
		
		System.out.println(Arrays.toString(name.toCharArray()));      //Conversion of String to Array
		System.out.println(search(name,target));
	}  //Calling search 


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