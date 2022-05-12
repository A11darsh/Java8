package mapdemos;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> vehicals=Arrays.asList("bus","car","river","ttable","train");
//		
//		for(String name:vehicals) {
//			System.out.println(name.length());
//		}
		vehicals.stream().map(e -> e.length()).forEach(System.out::println);
	
	}

}
