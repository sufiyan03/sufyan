package java_features;

interface SumAdd{
	abstract int sum(int a,int b);
}


class SumofNum implements SumAdd{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

class SumofString implements SumAdd{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		String s=a+""+b;
		return Integer.parseInt(s);
	}
	
}

public class Without_Functional_interface {

	public static void main(String[] args) {
		SumofNum s1=new SumofNum();
		System.out.println(s1.sum(11, 222));
		
		SumofString s2=new SumofString();
		System.out.println(s2.sum(333, 22));

	}

}
