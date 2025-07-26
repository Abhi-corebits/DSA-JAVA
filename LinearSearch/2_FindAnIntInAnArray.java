import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		//	Making an integer array 
		int arr[] = {20,40,18,9,78,65};
		//	Element to find
		int target = 78;
		
		
		System.out.println(Arrays.toString(arr));      
		System.out.println(linearSearch(arr , target ,  1 ,5));
	}  


// linearSearch function
static boolean linearSearch( int[] arr , int t , int start , int end ){
		
		for( int i = start ; i<=end ; i++)
		{
			if ( arr[i] == t ) return true;
		}
		
		return false;		
	}
}