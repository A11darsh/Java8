package streamMethod2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,6,4,5);
		
		List<Integer> sortedlist=list1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedlist);
		List<Integer> reverseSortedList= sortedlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reverseSortedList);
		
		List<String> name=Arrays.asList("ram","shyam","aaksh","anupam","adarsh");
		
		List<String> Reversename=name.stream().sorted().collect(Collectors.toList());
	
		System.out.println(Reversename);
		
		name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
