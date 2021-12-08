package java_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Min_bal {
	@Override
	public String toString() {
		return "Min_bal [accnt=" + accnt + ", name=" + name + ", balance=" + balance + "]\n";
	}

	private int accnt;
	private String name;
	private int balance;

	public Min_bal(int accnt, String name, int balance) {
		super();
		this.accnt = accnt;
		this.name = name;
		this.balance = balance;
	}

	public int getAccnt() {
		return accnt;
	}

	public void setAccnt(int accnt) {
		this.accnt = accnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		
		System.out.println("-----Minimum balance is 1000------");
		Min_bal m1=new Min_bal(101,"sufyan",9000);
		Min_bal m2=new Min_bal(102,"suhaib",700);
		Min_bal m3=new Min_bal(103,"uyaz",1033);
		Min_bal m4=new Min_bal(104,"arbaz",999);
		Min_bal m5=new Min_bal(105,"giri",8000);
		
		List<Min_bal> l1=new ArrayList<Min_bal>();
		l1.add(m1);
		l1.add(m2);
		l1.add(m3);
		l1.add(m4);
		l1.add(m5);
		l1.forEach(System.out::println);
		
		List<String> bal=l1.stream().filter(a->a.getBalance()<1000).
				map(b->b.getAccnt()+"\t"+b.getName()+"\t"+b.getBalance()).collect(Collectors.toList());
		bal.forEach(b->System.out.println("customers Having minimum balance :"+b));
	}

}
