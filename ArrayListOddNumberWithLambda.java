import java.util.ArrayList;
import java.util.List;

public class ArrayListOddNumberWithLambda {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(45);
		l.add(40);
		l.add(36);
		l.add(74);
		l.add(52);
		l.add(87);
		l.add(14);
		
		l.forEach((x) -> {if(x%2 ==0) {
			System.out.println(x+" is not a odd number.");
		}
		else {
			System.out.println(x+" is an odd number.");
		}
		});

	}

}
