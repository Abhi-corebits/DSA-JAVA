import java.util.Arrays;

// Creating Class for storing multiple return values
class SearchResult {
	
	boolean result ;
	int[] position;
    
    // Method
	SearchResult(boolean result, int[] position) {
		this.result = result;
		this.position = position;
	}
}

public class Main {
	public static void main(String[] args) {

		// 2D Array
		int[][] arr = {
			{2, 4, 8, 10},
			{3, 6, 9},
			{12, 77, 66, 20, 45}
		};

		int target = 12;

		// Calling Function & creating it as object
		SearchResult ans = search(arr, target);
		
		// Printing O/P
		System.out.println("Found : " + ans.result);
		System.out.println("At Indices : " + Arrays.toString(ans.position));
	}

	// Search Function
	static SearchResult search(int[][] arr, int target) {
		for (int row = 0 ; row < arr.length ; row++) {
			for (int column = 0 ; column < arr[row].length ; column ++) {
				if (arr[row][column] == target)
					return new SearchResult(true , new int[] {row,column});
			}
		}
		return new SearchResult(false , new int[] {-1,-1});
	}
}