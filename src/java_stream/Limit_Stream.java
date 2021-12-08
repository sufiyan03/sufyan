package java_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Limit_Stream {

	public static void main(String[] args) {
		Random r=new Random();
		r.ints(2).sorted().forEach(System.out::println);
		
		List<Integer> a=Arrays.asList(1,33,23,4,56,2,0,99);
		List<Integer> b1=a.stream().limit(3).collect(Collectors.toList());
		System.out.println("limited to 3 elements:"+b1);
		a.stream().sorted().forEach(n->System.out.print(n+" "));
		
		

	}

}
