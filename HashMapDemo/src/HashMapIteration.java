import java.util.HashMap;

public class HashMapIteration {
  public static void main(String[] args) {
	  HashMap<String, String> userCountryMap = new HashMap<>();
		
		userCountryMap.put("Anchit","India");
		userCountryMap.put("Andy", "USA");
		userCountryMap.put("Roy", "Germary");
		userCountryMap.put("Mary","France");
		userCountryMap.put("Ninad","Digras");
		
		userCountryMap.forEach((user,country)->{
			System.out.println(user+" --> "+country);
		});
		
		userCountryMap.keySet().forEach((user)->{
			System.out.println(user+" --> "+userCountryMap.get(user));
		});
		
		userCountryMap.entrySet().forEach((entry)->{
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		});
		
}
}
