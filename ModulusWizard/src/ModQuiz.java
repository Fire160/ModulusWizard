import java.util.Scanner;

public class ModQuiz
	{
	public static void main(String[] args)
		{
		Scanner things = new Scanner(System.in);
		System.out.println("Hello what is your name?");
		String name = things.nextLine();
		int answersRight = 0;
		System.out.println("So " + name + ", how many questions do you want?");
		int qNum = things.nextInt();
		for(int i = 0; i < qNum; i++)
			{
			int qB1 = (int) (Math.random() * 10) + 1;
			int qB2 = (int) (Math.random() * 10) + 1;
			int qA = qB1 % qB2;
			System.out.println(qB1 + " % " + qB2);
			int a = things.nextInt();
			if(a == qA)
				{
				System.out.println("Correct! Good job!");
				answersRight = answersRight + 1;
				}
			else
				{
				System.out.println("Sorry that was wrong!");
				}
			}
		System.out.println("You got " + answersRight + " questions right out " + qNum);
		things.close();
		}
	}