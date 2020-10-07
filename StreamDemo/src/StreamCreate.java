import java.awt.image.ImagingOpException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreate {
  public static void main(String[] args) {
//	Stream<Integer> streamObj = Stream.of(1,2,3,4,5,6);
	
//	streamObj.forEach(val->{
//		System.out.println(val.toString());
//	});
//	
//	Stream<Integer> streamObj2 = Stream.of(new Integer[]{1,2,3,4,5,6});
//	streamObj2.forEach(System.out::println);
	
//	streamObj.limit(3).forEach(System.out::println);
	
	List<Integer> list = new ArrayList<Integer>();
	 
    for(int i = 1; i< 10; i++){
        list.add(i);
    }
    
    List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
    list2.forEach(val->{
    	System.out.println(val.toString());
    });
    
    Integer[] evenNumbersAr = list.stream().filter(i->i%2==0).toArray(Integer[]::new);
    

}
}
