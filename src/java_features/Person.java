package java_features;
import java.util.*;




public class Person implements Comparable<Person> {
	private int age;
	private String First_name;
	private String Last_name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	
	
	public Person(int age, String first_name, String last_name) {
		super();
		this.age = age;
		First_name = first_name;
		Last_name = last_name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", First_name=" + First_name + ", Last_name=" + Last_name + "]";
	}
	@Override
	public int compareTo(Person o) {
		return Last_name.compareTo(o.Last_name);
	}
	
	public static void main(String[] args) {
		Person p1=new Person(21,"mohammed", "sufyan");
		Person p2=new Person(22,"mohammed","uyaz");
		Person p3=new Person(24,"mohammed","suhaib");
		Person p4=new Person(26,"mohammed","salman");
		ArrayList<Person> al=new ArrayList<Person>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		Collections.sort(al);
		al.forEach((n)->System.out.println(n));
		System.out.println();
		al.forEach((p)->{if(p.getLast_name().startsWith("s"))System.out.println(p);});//lambda experssion
//		for(Person p:al) {
//			if(p.getLast_name().startsWith("s")) {
//				System.out.println(p);
//			}
//		}
		}
	}
	
	
