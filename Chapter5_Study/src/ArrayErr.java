// Demonstrate an array overrun.
public class ArrayErr {
	public static void main(String[] args) {
		int[] sample = new int[10];
		int i;
		// generate an arrary overrun
		for(i = 0; i < 100; i = i + 1)
			sample[i] = i;
	}

}