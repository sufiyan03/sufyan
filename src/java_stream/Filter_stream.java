package java_stream;

import java.util.*;

public class Filter_stream {

	public static void main(String[] args) {
		List<String> ls=Arrays.asList("suf","suhaib","uyaz","uzaif","","");
		//reverse a array list
		Collections.reverse(ls);
		System.out.println(ls);
		
		long count =ls.stream().filter(s->s.isEmpty()).count();
		System.out.println("total empty spaces in the list:"+count);
		
		//whether list names contain the character 'a'
		ls.stream().filter(a->a.contains("a")).forEach(System.out::println);
		
		//wether list names starting with 'u' character
		ls.stream().filter(b->b.startsWith("u")).forEach(b->System.out.println("name start with U:"+b));
		
		
		List<Integer> a1=Arrays.asList(1,22,33,44,55,8,6,100);
		//reverse a array list
		Collections.reverse(a1);
		System.out.println(a1);
		
		//even or odd numbers
		a1.stream().filter(s->s%2==0).forEach(n->System.out.print(n+"\t"));
		System.out.println();
		
		//number divisible by 3 or not
		a1.stream().filter(p->p%3==0 || p%5==0).forEach(p->System.out.print(p+"\t"));
		System.out.println();
		
	}

}
