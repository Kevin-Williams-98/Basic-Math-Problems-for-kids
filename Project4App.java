package proj3;

import javax.swing.JOptionPane;

/**
 * Title : The Math Game
 * Description :  create a math game for children to play which will strengthen their addition and subtraction skills
 * @author Kevin Williams 
 *
 */
public class Project4App {
	public static void main(String[] args)
	{
		// Declared counters for number of addition and subtraction questions wrong and right
		int numAddCorrect = 0 ;
		int numAddWrong = 0;
		int numSubCorrect = 0;
		int numSubWrong = 0;

		// declared num total correct as numAddCorrect + numsubCorrect to have a variable for total correct questions
		int totalCorrect = numAddCorrect+numSubCorrect;

		//counter for number of questions 

		int numTotalQuestions = 0;

		// declared operator as char to store operator from question
		char operator ;

		// For loop for the first 10 question because they have to be asked 
		for (int i = 1; i < 11; i++)
		{
			//Instantiates new question, display and return the users answer to the question, stores the users answer in answer.  
			//The answer is then compared with the correct answer.
			Question theQuestion = new Question();
			int answer = Integer.parseInt(JOptionPane.showInputDialog(theQuestion.toString()));
			int correctAnswer = theQuestion.determineAnswer();

			// If statement to display the correct output based on if the user got the right answer or not
			if (answer == correctAnswer )

				JOptionPane.showMessageDialog(null,"Congratulations, you got it correct !");

			else 

				JOptionPane.showMessageDialog(null,"The correct answer for " + theQuestion.toString() +"\n " + "is" + "\n "+ correctAnswer  );

			operator = theQuestion.getOperator();

			// If else statement to add to the subtraction or addition counters based on whether the user got the question right or not and whether it was a subtraction or 
			// addition problem

			if((operator == '+') && (answer == correctAnswer))
				numAddCorrect = numAddCorrect +1 ;
			else
				if((operator == '+')&& (answer != correctAnswer))
					numAddWrong= numAddWrong+1;
				else 
					if ((operator == '-')&& (answer == correctAnswer))
						numSubCorrect= numSubCorrect+1;
					else
						numSubWrong = numSubWrong+1;

			// counter for total questions
			numTotalQuestions = numTotalQuestions + 1;
			// Displaying number of question to help me keep track while testing 
			System.out.println(numTotalQuestions);

		}

		// Calculate average
		totalCorrect = numAddCorrect + numSubCorrect ;
		System.out.println(totalCorrect);
		double average = (totalCorrect)/(numTotalQuestions*1.0)*(100.0);
		if (totalCorrect==10)
		{
			JOptionPane.showMessageDialog(null, "Addition:" +"\n"+ "You got "+ numAddCorrect + " correct and "+ numAddWrong + " incorrect"+"\n" + 
					"Subtraction:" +"\n"+ "You got "+ numSubCorrect + " correct and "+ numSubWrong + " incorrect" + "\n" + "The percent correct is " + average);
		}

		// Loop to execute if number of questions correct is less than 10 
		if (totalCorrect < 10)
		{
			// created Flag for while loop (keepGoing)
			boolean keepGoing = true;
			while (keepGoing)
			{

				Question theQuestion = new Question();
				int answer = Integer.parseInt(JOptionPane.showInputDialog(theQuestion.toString()));
				int correctAnswer2 = theQuestion.determineAnswer();
				if (answer == correctAnswer2)
				{
					JOptionPane.showMessageDialog(null,"Congratulations, you got it correct !");
					totalCorrect ++ ;
				}
				else 

					JOptionPane.showMessageDialog(null,"The correct answer for " + theQuestion.toString() +"\n " + "is" + "\n "+ correctAnswer2  );

				operator = theQuestion.getOperator();
				if((operator == '+')&& (answer == correctAnswer2))

					numAddCorrect = numAddCorrect +1 ;
				else
					if((operator == '+')&& (answer != theQuestion.determineAnswer()))
						numAddWrong= numAddWrong+1;
					else 
						if ((operator == '-')&& (answer == theQuestion.determineAnswer()))
							numSubCorrect= numSubCorrect+1;
						else
							numSubWrong = numSubWrong+1;

				// Calculates average as it goes in the loop 

				numTotalQuestions = numTotalQuestions + 1;
				average = (totalCorrect)/(numTotalQuestions*1.0)*(100.0);
				totalCorrect = numAddCorrect + numSubCorrect ;
				System.out.println(totalCorrect);
				System.out.println(average);
				System.out.println(numTotalQuestions);
				if ((average >= 85.0)||((average<85.0) &&(numTotalQuestions >= 20)))
					keepGoing = false;

			}


			JOptionPane.showMessageDialog(null, "Addition:" +"\n"+ "You got "+ numAddCorrect + " correct and "+ numAddWrong + " incorrect"+"\n" + 
					"Subtraction:" +"\n"+ "You got "+ numSubCorrect + " correct and "+ numSubWrong + " incorrect" + "\n" + "The percent correct is " + average);
		}



	}
}
