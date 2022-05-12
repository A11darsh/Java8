package streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
	List<String> vehicalList=Arrays.asList("bus","car","bus","bycle","car");
	List<String> distinctVehical=vehicalList.stream().distinct().collect(Collectors.toList());
	
	System.out.println(distinctVehical);
	
	long count=vehicalList.stream().distinct().count();
	
	System.out.println(count);
	
	List<String> limitedvehicalList=vehicalList.stream().limit(3).collect(Collectors.toList());
	System.out.println(limitedvehicalList);
	}

}
