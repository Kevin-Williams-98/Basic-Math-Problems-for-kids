package proj3;
/**
 * Class to randomly generate enough questions to accurately check the question class using a for loop
 * @author Kevin Williams
 *
 */
public class Project3App {
	public static void main(String[] args)
	{
		for (int i = 1; i < 16; i++)
		{
			Question theQuestion = new Question();
			System.out.println("Question " + i + ": " + theQuestion.toString() + " " +theQuestion.determineAnswer());
			
		}
	}
}
