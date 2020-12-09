package proj3;
/**
 * Question constructor, determineAnswer, and to string method to be able to display the question.
 * @author Kevin Wiliams
 */
import java.util.Random;
public class Question {

	private char operator;
	private int num1;
	private int num2;
	Random generator = new Random();
/**
 * default constructor
 */
	public Question()
	{
		if (generator.nextInt(2)==0)
		{
			operator = '+';
		}
		else
		{
			operator = '-';
		}

		if (operator == '+')
		{
			num1 = generator.nextInt(13)+0; 
			num2 = generator.nextInt(13)+0;
		}
		else  
		{
			num1 = generator.nextInt(7)+6;
			num2 = generator.nextInt(num1)+1;
		}
		

		}
	/**
	 * determineAnswer method solves the problem and returns an answer for the problem
	 * @return int
	 */
	    public int determineAnswer()
	    { 
	    	if (operator == '+')
	    	{ 
	    		return num1+ num2 ;
	    	}
	    	else
	    	{
	    		return num1 - num2;
	    	}
	    }
	    /**
	     * toString Method
	     * creates and returns a string with the entire question and an equal sign
	     */
	    public String toString()
	    {
	    	
	    	String str = new String (num1 +" "+ operator +" "+ num2 + " =");
	    	return str;
	    }

}
