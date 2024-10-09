package enumpack;
enum Day{
	MON,TUE,THR,FRI,SAT,SUN;
}
public class EnumDemo4 {

	public static void main(String[] args) {
		
			System.out.println("display all values using enhanced for loop ");
			for(Day d1 : Day.values()) {
				System.out.println(d1);
			}
			   System.out.println("=====================");
			   Day d=Day.TUE;
			   System.out.println(d);   
			   
		   switch(d) {
		   case MON :
			   System.out.println("first day of week");
			   break;
		   case TUE :
			   System.out.println("second day of week");
			   break; 
		   case THR :
			   System.out.println("THIRD day of week");
			   break;
		   case FRI :
			   System.out.println("GOOD day of week");
			   break;
		   case SAT :
			   System.out.println("SLEEPY DAY");
			   break;   
		   case SUN:
			   System.out.println("sunday is holiday");
			   break;
		   }
	}

}
