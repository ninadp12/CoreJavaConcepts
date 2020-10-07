import java.util.HashMap;
import java.util.Map;


public class FrequencyOfEachWord {
   public static void main(String[] args) {
	 String  str = "ninadparalikar";
	 
	 Map<Character, Integer> mapObj = new HashMap<>();
	 
	 for(int i=0; i<str.length();i++){
		 Character c = str.charAt(i);
		 mapObj.computeIfAbsent(c,(charecter)->1);
		 mapObj.computeIfPresent(c, (charecter,count)->count+1);
	 }
	 
	 System.out.println(mapObj);
	 
}
}
