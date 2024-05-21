// The for-each loop is essentially read-only.
public class NoChange {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 };
		//int y = 100; declare int y will cause duplicate variable error
		
		for(int y : nums) {
			System.out.print(y + " ");
			y = y * 10; // no effect on nums
		}
		
		System.out.println();
		
		for(int x : nums)
			System.out.print(x + " ");
		
		System.out.println();
	}

}
