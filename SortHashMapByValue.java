import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> scores = new HashMap<>();
		
		scores.put("Ram", 95);
		scores.put("David", 92);
		scores.put("Danny", 45);
		scores.put("Dave", 87);
		scores.put("Jon",	67);
		scores.put("Rick", 59);
		
		System.out.println("Before sort: "+scores);
		sortByValues(scores);
		System.out.println("After sort: "+scores);
		

	}
	
	private static Map<String,Integer> sortByValues(Map<String,Integer> score){
		
		
		Map<String,Integer> sortByValues = new LinkedHashMap<String, Integer>();
		
		Set<Entry<String,Integer>> entrySet = score.entrySet();
		System.out.println("Set: "+entrySet);
		
		List<Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println("List: "+entryList);
		
		entryList.sort((x,y) -> x.getValue().compareTo(y.getValue()));
		System.out.println("After sorting the list: "+entryList);
		
		for(Entry<String,Integer> e : entryList) {
			sortByValues.put(e.getKey(), e.getValue());
		}
		
		
		return sortByValues;
		
	}

}
