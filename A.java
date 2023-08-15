package FirstRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		String input="hello world";
		LinkedHashMap<Character, Long> collect = input.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		Optional<Character> findFirst = collect.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
	
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
			
		}
		else {
			System.out.println("No Repeating character");
		}
		
		Optional<Character> firstNonRepeating = collect.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst();
	
	
		if (firstNonRepeating.isPresent()) {
			System.out.println(firstNonRepeating.get());
			
		}
		else {
			System.out.println("No Repeating cHaracter");
		}
	
	}

}
