package getputs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = new ArrayList<>(Arrays.asList(1,2,3,4)); 
		List<String> myStgs = new ArrayList<>(Arrays.asList("Joao", "Maria")); 

		List<? super Number> myObjs;
		
	}
}
