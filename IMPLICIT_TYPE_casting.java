package TYPE_CASTING;

public class IMPLICIT_TYPE_casting {
	
	public void implicit()
	{
		// EXAMPLE OF THEE IMPLICIT TYPE CASTING 
		/* Implicit type casting the data type casting where the data of the smaller size data type is transfered 
		  Bigger data type  */
		/* By using the casting data cannot be modified only data type is modified */
		
		System.out.println(" IMPLICIT type casting ");
		
		byte a=100;  // one byte data // stored 100 in a 
		
		short b=a;    // value of a is transfered in b 
		
		int c=b;     // b transfered to c 
		
		long d=c;
		
		float e=d;
		
		double f=e;
		
		
		System.out.println(" BYTE data    : " +a);
		System.out.println(" Short data   : " +b);
		System.out.println(" INT data     : " +c);
		System.out.println(" LONG data    : " +d);
		System.out.println(" FLOAT  data  : " +e);
		System.out.println(" DOUBLE data  : " +f);
		
		
		
	}
	

}
