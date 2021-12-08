package java_stream;

import java.util.*;
import java.util.stream.Collectors;
public class Map_stream {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("sufyan");
		al.add("unknown");
		al.add("uyaz");
		al.add("suhaib");
		al.stream().map((a)->a.toUpperCase()+"  ").forEach(System.out::print);//using stream method
		System.out.println();
		
		List<String> a2=al.stream().map((c)->c.endsWith("n")+" ").collect(Collectors.toList());//another method
		a2.forEach(System.out::print);
		
		System.out.println();
		List<String> a3=al.stream().map((c)->c.concat("--hello")+" ").collect(Collectors.toList());
		a3.forEach(System.out::print);
		
		System.out.println();
		List<String> a4=al.stream().map((c)->c.length()+" ").collect(Collectors.toList());
		a4.forEach(System.out::print);
		
		System.out.println();
		List<String> a5=al.stream().map((c)->c.replace("s", "new ")+" ").collect(Collectors.toList());
		a5.forEach(System.out::print);
		
		System.out.println();
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(9);
		a1.add(2);
		a1.add(4);
		a1.add(7);
		a1.stream().map((b)->b*b+" ").forEach(System.out::print);
	}

}