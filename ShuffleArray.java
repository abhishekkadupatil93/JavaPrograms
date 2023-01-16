import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,0}; // using integer values
		
		Random rand = new Random();
		//for multiple combinations
		//for(int j = 0; j< array.length; j++) {
		for(int i = 0; i< array.length; i++) {
			int randomIndextoSwap = rand.nextInt(array.length);
			
			int temp = array[randomIndextoSwap];
			array[randomIndextoSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	//	}
		
		
		String str = "abcd";  // using characters
		
		char[] ch = str.toCharArray();
		for(int j = 0; j< ch.length; j++) {
		for(int i = 0; i< ch.length; i++) {
			int randomCombination =  rand.nextInt(ch.length);
			
			char temp = ch[randomCombination];
			ch[randomCombination] = ch[i];
			ch[i] = temp;
		}
		
		System.out.println(Arrays.toString(ch));
		}		
	}
}
