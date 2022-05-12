package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemos1 {

	public static void main(String[] args) {
		List<String> vehicals=Arrays.asList("bus","car","river","table","train");
	
		List<String> VehicalUpperCase=new ArrayList<String>();
//	
//	for(String name:vehicals) {
//		VehicalUpperCase.add(name.toUpperCase());
//	}
//	System.out.println(VehicalUpperCase);
//	}

		VehicalUpperCase=	vehicals.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println(VehicalUpperCase);
		
	}	
}
