import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		
		hm.put(1,"Java");
		hm.put(2,"SAP");
		hm.put(3,"Oracle");
		hm.put(4,"Salesforce");
		hm.put(5,"Machine Learning");
		
		hm.replace(3,"PLSQL");
		hm.remove(5);
		System.out.println(hm.entrySet());

	}
}

//implement java linkedhashmap program to perform -
//add the training by training id and training name 
//add 5 entries
//replace the 3rd training by new one
//delete the last training details 
//and display the key value pairs



