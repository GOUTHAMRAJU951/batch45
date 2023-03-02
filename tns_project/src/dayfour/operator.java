package dayfour;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int x=10;
		System.out.println("the value of a and b before operation: "+a+"and"+b);
		++a;
		int c=++a+b+a--;
		System.out.println("the value of c after the operation is: "+c);
		int d=c++ +a+b--;
		System.out.println("d after the operator is : "+d);
		System.out.println("the value a and b after oparator is : "+a+ "and"+b);
		
		x=(10==x)? 1:0;
		System.out.println(x);

	}

}
