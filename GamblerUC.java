import java.util.Scanner;

class GamblerUC
{
	public static void main(String[] args)
	{
		int stake, goal, noOfTime;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the $Stake value :");
		stake = scanner.nextInt();

		System.out.println("Enter the $Goal value :");
		goal = scanner.nextInt();

		System.out.println("Enter the Number of Time :");
		noOfTime = scanner.nextInt();

		int bets = 0;	//Total Number of Bets Made
		int win = 0;	//Total Number of Games Won

		for (int i = 0; i < noOfTime; i++)
		{
			int cash = stake;

			while (cash > 0 && cash < goal)
			{
				bets++;

				if (Math.random() < 0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}

			if (cash == goal)
			{
				win++;
			}
		}

		System.out.println(win+" win of "+noOfTime);
		System.out.println("Percent of games won = " + 100.0 * win / noOfTime);
		System.out.println("Avg # bets           = " + 1.0 * bets / noOfTime);
	}
}
