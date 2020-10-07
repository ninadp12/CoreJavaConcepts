import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ListOne {

	public static void main(String[] args) {
		List<String> pointList = new ArrayList();
		 
		pointList.add("1");
		pointList.add("2");
		 
		pointList.forEach(p ->  { System.out.println(p); } );
		pointList.forEach(val->{
			System.out.println(val);
		});
		
		List<String> names = Arrays.asList("Alex", "Brian", "Charles");
		
//		names.forEach(System.out::println);
		
		Consumer<String> uppercaseObj = new Consumer<String>() {

			@Override
			public void accept(String t) {
			   System.out.println( t.toUpperCase());
			}
			
		};
		
		names.forEach(uppercaseObj);
		
		
		
		Map<String, String> map = new HashMap<String, String>();
		 
		map.put("A", "Alex");
		map.put("B", "Brian");
		map.put("C", "Charles");
		
		map.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		
		
		
	}
}
