import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int arr[] = {20,40,18,9,78,65};
		
	    // Printing The Array 	
		System.out.println(Arrays.toString(arr));      
		// Calling Min Fuction
		System.out.println(minimum(arr));
	}  


// Minimum function
static int minimum( int[] arr ){
		
		// Corner Cases
		if( arr.length == 0 || arr == null ) return 0000;
		
		// Creating a variable to hold an object 
		int min = arr[0];
		
		// Looping through array	
		for( int i = 1 ; i < arr.length ; i++ )
		{
			// Check if other elements has lower value than min
			if(min < arr[i]) min = arr[i];
		}
		
		return min;	
	}
}