import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		
		//TreeMap<String,Integer>treeMap=new TreeMap<>();
		NavigableMap<String,Integer>treeMap= new treeMap<>();
		treeMap.put("John",001);
		treeMap.put("Peter",002);
		treeMap.put("Aryan",003);
		treeMap.put("Surya",004);
		
		
		for(Map.Entry m1:treeMap.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		System.out.println(treeMap);
		
		treeMap.remove("John");
	}

}
