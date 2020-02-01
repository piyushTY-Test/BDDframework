package cucumberQk;

public class Calculator {
	int result;
	String errorMsg = null;


	public int add (int x,int y )
	{

		int result ;
		if((x<1000 && x>0)&&(y<1000 && y>0))
		{
			System.out.println("Condition Satisfied");
			result=x+y;
		}
		else
		{
			System.out.println("Numbers are not within Range ");
			errorMsg = "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0";
			result = -1;
		}
		return result;

	}

	public int add (Double x,Double y ) {
		errorMsg="Improper input Provided Numbers Need To Be Integers only";
		return -1;
	}

	public String getErrorMsg()
	{
		return  errorMsg;
	}

	public int add (int x,Double y ) {
		errorMsg="Improper input Provided Numbers Need To Be Integers only";
		return -1;
	}
	public int add (Double x,int y ) {
		errorMsg="Improper input Provided Numbers Need To Be Integers only";
		return -1;
	}
}
