import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StremOperation {
  public static void main(String[] args) {
	  List<String> memberNames = new ArrayList<>();
	  memberNames.add("Amitabh");
	  memberNames.add("Shekhar");
	  memberNames.add("Aman");
	  memberNames.add("Rahul");
	  memberNames.add("Shahrukh");
	  memberNames.add("Salman");
	  memberNames.add("Yana");
	  memberNames.add("Lokesh");
	  
	  List<String> list = memberNames.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
	  
	  Consumer<String>  objCon = new Consumer<String>() {

		@Override
		public void accept(String str) {
			System.out.println(str.toUpperCase());
			
		}
	};
	
	list.forEach(objCon);
	
	System.out.println("*******************************");
	
	memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);;
	
	
	List<Integer> listOfInt = Arrays.asList(1,2,3,4,5,6); 
	List<Long> listOflong  = listOfInt.stream().map(Long::valueOf).collect(Collectors.toList());
	
	 List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
     
     List<Integer> listOfIntegers = listOfStrings.stream()
                     .map(Integer::valueOf)
                     .collect(Collectors.toList());
      
     System.out.println(listOfIntegers);
     

	
	
}
}
