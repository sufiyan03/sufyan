package java_features;
import java.util.*;
public class Lambda_List {
//arrow token--- it is used to create link between parameter and body expression
//body--it contains exp or lambda exp
//argumnt-list---it can be empty or non empty
//		()->{}
//		(p1)->{}
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(22);
		list.add(3);
		list.forEach((n)->System.out.println(n));	//lambda expression
		
		Integer[] num= {1,3,56,8,9,30,91,6};
		List<Integer> numList=Arrays.asList(num);
		numList.stream().filter(n->n%2==0).forEach(System.out::println);//print even or add numbers
//		numList.stream().filter(n->n%2==0).forEach((i)->System.out.println(i));
	}

}
