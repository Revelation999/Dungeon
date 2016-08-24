import java.util.Scanner;
public class Blackjack {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int money = 100;
		int play = 1;
		while (play < 2&&money>0)
		{
		System.out.println("How much do you want to bet?");
		int bet = userInput.nextInt();
		if (bet <= 0)
		{
			System.out.println("You cheater!");
			break;
		}
		System.out.println("Here we go!");
		int com1 = (int)(Math.random()*13)+1;
		int com2 = (int)(Math.random()*13)+1;
		int pla1 = (int)(Math.random()*13)+1;
		int pla2 = (int)(Math.random()*13)+1;
		System.out.println("You cards are "+pla1+" and "+pla2);
		System.out.println("Computer have"+com1);
		if (com1==1)
		{
			System.out.println("Want to quit? Computer has an \"A\" Yes or no?");
			String uit = userInput.nextLine();
			if (uit.equals("yes"))
			{
				break;
			}
		}
		if (com1==1&&com2>=10||com1>=10&&com2==1)
		{
			System.out.println("Computer have a blackjack!");
			if (pla1==1&&pla2>=10||pla1>=10&&pla2==1)
			{
				System.out.println("Player had a blackjack too!");
			}
			else
			{
				money = money - bet;
				System.out.println("You lose, money left"+money);
				System.out.println("Press q to quit, other to continue");
				String conti = userInput.nextLine();
				if (conti.equals ("q"))
				{
					play++;
			    }
			}
		}
		else if (pla1==1&&pla2>=10||pla1>=10&&pla2==1)
		{
			money = money + bet;
			System.out.println("You won, you now have"+money);
			System.out.println("Press q to quit, other to continue");
			String conti = userInput.nextLine();
			if (conti.equals ("q"))
			{
				play++;
		    }
		}
		else
		{
			if(pla1>10)
			{
				pla1 = 10;
			}
			if(pla2>10)
			{
				pla2 = 10;
			}
			if(com1>10)
			{
				com1 = 10;
			}
			if(com2>10)
			{
				com2 = 10;
			}
			int comt = com1+com2;
			int plat = pla1+pla2;
			String onti = userInput.nextLine();
				int get = 1;
				while (get == 1&&plat <= 21)
				{
					System.out.println("Get another card? Answer \"yes\" or \"no\"");
					String tei = userInput.nextLine();
					if (tei.equals("yes"))
							{
						int ancd = (int)(Math.random()*13)+1;
						ancd = (int)(Math.min(ancd, 10));
						plat = plat +ancd;
						System.out.println("YOu now have "+plat);
							}
					else
					{
						get++;
					}
				}
			
				if (plat > 21)
				{
					
					money = money - bet;
					System.out.println("You busted with the point of "+plat+", you now have "+money);
					System.out.println("Press q to quit, other to continue");
					String conti = userInput.nextLine();
					if (conti.equals ("q"))
					{
						play++;
				    }
				}
				else if (get ==2)
				{
					if (plat > comt)
					{
						money = money + bet;
						System.out.println("You won, you now have"+money);
						System.out.println("Press q to quit, other to continue");
						String conti = userInput.nextLine();
						if (conti.equals ("q"))
						{
							play++;
					    }
					}
					else if (plat == comt)
					{
						System.out.println("Tie!");
						System.out.println("Press q to quit, other to continue");
						String conti = userInput.nextLine();
						if (conti.equals ("q"))
						{
							play++;
					    }
					}
					else
					{
						money = money - bet;
						System.out.println("You lose, money left"+money);
						System.out.println("Press q to quit, other to continue");
						String conti = userInput.nextLine();
						if (conti.equals ("q"))
						{
							play++;
					    }
					}
				}
			else if (onti.equals ("no"))
			{
				if (plat > comt)
				{
					money = money + bet;
					System.out.println("You won, you now have"+money);
					System.out.println("Press q to quit, other to continue");
					String conti = userInput.nextLine();
					if (conti.equals ("q"))
					{
						play++;
				    }
				}
				else if (plat == comt)
				{
					System.out.println("Tie!");
					System.out.println("Press q to quit, other to continue");
					String conti = userInput.nextLine();
					if (conti.equals ("q"))
					{
						play++;
				    }
				}
				else
				{
					money = money - bet;
					System.out.println("You lose, money left"+money);
					System.out.println("Press q to quit, other to continue");
					String conti = userInput.nextLine();
					if (conti.equals ("q"))
					{
						play++;
				    }
				}
			}
		}
		}
        if (money <= 0)
        {
        	System.out.println("Game over");
        }
	}

}
