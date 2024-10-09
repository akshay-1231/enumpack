package enumpack;
enum Month1{
		JAN,FEB,MAR,APR,MAY;
	}
public class EnumDemo2 {

	public static void main(String[] args) {
	   Month1 m=Month1.JAN;
	   System.out.println(m);
	   switch(m) {
	   case JAN :
		   System.out.println("this is first month");
		   break;
		   
	   case FEB :
		   System.out.println(" A is wonderful month");
		   break;
	   case MAR :
		   System.out.println(" month with high temperature");
		   
	   case APR :
		   System.out.println(" EXAM MONTH"); 
		   break;
	   case MAY:
		   System.out.println(" RESTING MONTH"); 
		   break;
	   }

	}

}
