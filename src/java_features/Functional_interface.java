package java_features;

interface sum{
	abstract int Calculate(int a,int b);
}

interface Simple{
	abstract String hello(String name);
}

interface StringLength{
	abstract int getLength(String name);
}

interface Square{
	abstract double getSquare(double a);
}
public class Functional_interface {

	public static void main(String[] args) {
		
		
		sum s1=(int a,int b)->a*b;	//lambda expression
		int ans=s1.Calculate(11,3);
		System.out.println(ans);
		
		sum s2=(int a,int b)->a/b;	//lambda expression
		int an=s2.Calculate(33,11);
		System.out.println(an);
		
		Simple s3=(String n)->"Hello\t"+n +"\tGood afternoon";	//lambda expression
		String a=s3.hello("Sufyan");
		System.out.println(a);
		
		StringLength s4=(String x)->x.length();	//lambda exp to find length of String
		int b=s4.getLength("mohammed sufyan");
		System.out.println(b);
		
		Square s5=(double p)->p*p;	//lambda exp to find sqaure of a number
		double sq=s5.getSquare(18);
		System.out.println(sq);
		
	}

}
