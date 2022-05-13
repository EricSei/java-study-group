package core.java.deck;
import java.util.Random;
import java.util.Scanner;

public class Deck {

	
	public static void main(String[] args) {
	
		String[] suits = { "Clubs","Diamonds", "Hearts", "Spades" }; 
		String[] values = { "Ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack",
				"Queen", "King" };
		//                                            J   Q   K
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
		
		int playerCard = 0;
		int dealerCard = 0;
		
		Random suit = new Random();
		Random value = new Random();
		
		System.out.println("Pick a card for you");
		System.out.println("- - - ");
		Scanner scan = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while (isContinue) {
			playerCard = 0;
			 dealerCard = 0;
		
			int playerSuitCard1 = suit.nextInt(suits.length); //0-3 // power in order
			int playerValueCard1 = value.nextInt(values.length); //0-11
			int playerFirstCard = nums[playerValueCard1];// 
			 playerCard += 1;
			System.out.println("Your first card is " + values[playerValueCard1] + " of " + suits[ playerSuitCard1]);
			
			int playerSuitCard2 = suit.nextInt(suits.length);
			int playerValueCard2 = value.nextInt(values.length);
			int playerSecondCard = nums[playerValueCard2];
			playerCard += 1;
			System.out.println("Your second card is " + values[playerValueCard2] + " of " + suits[playerSuitCard2]);
			
			int  player = playerFirstCard + playerSecondCard; //player == valuesOfCard
			
			
			System.out.println("player: " + player);
			
			player = player % 10;
			System.out.println("Player's value: " + player + " and card are " + playerCard + "cards" );
			
			
			System.out.println("Would you like to Hit (1) or stay (2)? ");
			
			int playerHit = scan.nextInt();
			while (playerHit == 1) {
				
				int playerSuitCard3 = suit.nextInt(suits.length);
				int playerValueCard3 = value.nextInt(values.length);
				int playerThirdCard = nums[playerValueCard3];
				playerCard += 1;
				System.out.println("You draw a card is " + values[playerValueCard3] + " of " + suits[playerSuitCard3]);
				
				player += playerThirdCard;
				
				System.out.println("Player total: " + (playerFirstCard + playerSecondCard + playerThirdCard));
				player = player % 10;
				System.out.println("Final player's value: " + player + " and card are " + playerCard + "cards" );
				playerHit = 0;
			}
			
			//Dealer Start
			int dealerSuitCard1 = suit.nextInt(suits.length);
			int dealerValueCard1 = value.nextInt(values.length);
			int dealerFirstCard = nums[dealerValueCard1];
			 dealerCard +=1;
			System.out.println("Dealer first card is " + values[dealerValueCard1] + " of " + suits[dealerSuitCard1]);
			
			int dealerSuitCard2 = suit.nextInt(suits.length);
			int dealerValueCard2 = value.nextInt(values.length);
			int dealerSecondCard = nums[dealerValueCard2];
			dealerCard +=1;
			System.out.println("Dealer second card is " + values[dealerValueCard2] + " of " + suits[dealerSuitCard2]);
			
			int  dealer = dealerFirstCard + dealerSecondCard ;
			
			System.out.println("dealer: " + dealer);
			
			dealer = dealer % 10;
			System.out.println("Dealer's value: " + dealer + " and card are " + dealerCard + "cards" );

			if( dealer< 5) {

				int dealerSuitCard3 = suit.nextInt(suits.length);
				int dealerValueCard3 = value.nextInt(values.length);
				int dealerThirdCard = nums[dealerValueCard3];
				 dealerCard += 1;
				System.out.println("Dealer draw a card is " + values[dealerValueCard3] + " of " + suits[dealerSuitCard3]);
				dealer += dealerThirdCard ;
				
				
				System.out.println("Dealer total: " + ( dealerFirstCard + dealerSecondCard + dealerThirdCard));
				dealer = dealer % 10;
				System.out.println("Final dealer's value: " + dealer + " and card are " + dealerCard + "cards"  );
				
			
			}
				//      
				//print(player == totalValue, dealer==dealerValue, playerCard == numberofCards, dealerCard==numberofCards );
				
				System.out.println("Would you like to play again? Yes (1) or No (2)");
				int choice = scan.nextInt();
				if (choice == 2)
					isContinue = false;
			
		
		}
		
	}
	
	
	//return Dealer win -> 1, player -> 2
	
	public int winner(int playerValue, int dealerValue, int numOfPlayerCards, int numOfDealerCards ) {
		
		if(playerValue < dealerValue) {
			return 2;
		}else if(dealerValue > playerValue) {
			return 1;
		}else { //two values are equal
			if(numOfDealerCards == 2 && numOfPlayerCards > 2 ) {
				return 1;
			}else if(  numOfPlayerCards== 2 && numOfDealerCards > 2) {
				return 2;
			}else{//equal cards
				
			}
		}
		
		return 0;
	}

}





				 
		
			

			 
					
