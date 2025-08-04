 import java.util.Random;
 import java.util.Scanner;
 
 class Game{
	 Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(100)+1; // (1-100)
		
		int attempts = 0;
		
		Game(){
			play();
			score();
		}
		
		int play(){
		     while(attempts<5){
					System.out.print("Enter your guess (1-100) : ");
					int guess = sc.nextInt();
					
					if(guess == number){
						System.out.println("Your guess is correct !! ");
						return 1;
					}
					else if(number > (guess+5) ){
						System.out.println("Your guess is too low !! ");
					}
					else if(number < (guess-5) ){
						System.out.println("Your guess is too high !! ");
					}
					else {
						System.out.println("Wrong guess but you are closer to the actual number.");
				    }
					attempts++;
			   }
		     System.out.println("\nYou have used your all attempts...You lose the game..!!");
		     System.out.println("Correct answer is : "+number );
		     return 0;
		}
		
		void score(){
			if(attempts == 1 ){
		    	System.out.println("Your score is : 100");
		    }
			else if(attempts == 2){
		    	System.out.println("Your score is : 80");
			}
            else if(attempts == 3){
		    	System.out.println("Your score is : 60");
			}
            else if(attempts == 4){
		    	System.out.println("Your score is : 40");
			}
            else if(attempts == 5){
		    	System.out.println("Your score is : 20");
			}
            else {
		    	System.out.println("Your score is : 00");
            }
		}
 }
 
 public class NUMBER_GAME {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
		System.out.println("Let's play the game...!!");
		System.out.println("Guess the number that i have generated in my mind.");
		System.out.println("Start");
		
		Game game = new Game();
		String reply;
	    
		System.out.println("Thank you for playing!");
		
	    System.out.println("\nDo you want to play again (Yes/No)?");
	    reply = sc.nextLine();
	    if(reply.equalsIgnoreCase("Yes")) {
	    	new Game();
	    }
	    else
	    {
	    	System.out.println("OK");
	    }
		
   }
 }
