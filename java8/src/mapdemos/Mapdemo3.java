package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo3 {

	public static void main(String[] args) {
		List<Integer> numbersList=Arrays.asList(2,3,4,5,6);
		
		List<Integer> modifyNumber=numbersList.stream().map(e ->e*3).collect(Collectors.toList());
		System.out.println(modifyNumber);
	
	}

}
