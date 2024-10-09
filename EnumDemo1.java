package enumpack;


interface Interface1{
	String comp="OGD";
	void fun1();
}

//1 method
enum Month implements Interface1 {
	JAN,FEB,MAR,APR,MAY;

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}
}
public class EnumDemo1 {
	//2 nd method
	//enum Month{
	//	JAN,FEB,MAR,APR,MAY;
	//}
	public static void main(String[] args) {
		// 3rd method
		//enum Month {
		//	JAN,FEB,MAR,APR,MAY;
		//}
		System.out.println("display all values using enhanced for loop ");
		for(Month mm : Month.values()) {
			System.out.println(mm);
		}
		
		System.out.println("==============================");
		
		//to call function
		Month m=Month.MAY;
		//D   V  
		Month m1=Month.FEB;
		Month m2=Month.APR;
		Month m3=Month.JAN;
		
		int a=100;
		//CALLING FUNCTION
		m.fun1();
		
		System.out.println("m is"+m);
		System.out.println("m1 is"+m1);
		System.out.println("m2 is"+m2);
		System.out.println("m3 is"+m3);
	}

}
