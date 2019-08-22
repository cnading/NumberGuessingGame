import java.util.Scanner;

public class NumberGuessingGame
	{
		static boolean playAgain = true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput2 = new Scanner(System.in);


		public static void main(String[] args)
			{
				while (playAgain)
					{
						int guess = 0;
						int counter = 1;
						String response = "";
						String name = "";
						int random = (int) (Math.random() * 10) + 1;
						boolean keepPlaying = true;
						System.out.println("Hello child, do you bear a name?");
						name= userInput2.nextLine();
						System.out.println("Alrighty " + name + ", I'm thinking of a number between one and ten, go ahead and guess.");
						guess = userInput.nextInt();
						while (keepPlaying == true)
							{
								//test

								if (guess == random)
									{
										System.out.println("Congrtats you guessed it!");
										keepPlaying = false;
									} else if (guess > random)
									{
										System.out.println("Lower! Guess Again!");
										guess = userInput.nextInt();
										counter++;
									} else if (guess < random)
									{
										System.out.println("Higher! Guess Again!");
										guess = userInput.nextInt();
										counter++;
									}
							}
						if (counter == 1)
							{
								System.out.println("WOW it took you only 1 try!");
							} else
							{
								System.out.println("Took you long enough! It took you " + counter + " guesses!");

							}
						System.out.println("Wanna play again?");
						response = userInput2.nextLine();

						if (response.equals("Yes"))
							{
								System.out.println("SICK!");

							} else
							{
								System.out.println("Kewl catcha later.");
								playAgain = false;
							}
					}

			}
	}
