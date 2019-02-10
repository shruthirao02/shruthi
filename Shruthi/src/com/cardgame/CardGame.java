package com.cardgame;



import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGame {

	/* 
	* A Deck of Cards Game to do the following
	* Create a standard Deck of Playing Cards 
	* Shuffle the Deck
	* Deal as many cards as possible to a number of players specified 
	*/

		    private static int NO_OF_PLAYERS = 0;

	    public static void main(String[] args) {
	    
	        Integer[] deck = new Integer[52];
	        int curPlayer= 0; 
	        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	        
	// Initialize cards
	        System.out.println("Cards before shuffle");

	        for (int i = 0; i < deck.length; i++) {
	          deck[i] = i;
	    
	          String suit = suits[deck[i] / 13];
	          String rank = ranks[deck[i] % 13];
	          String card =  rank + " of " + suit;
	        
	         
	 // Display the all the cards before shuffle
	          System.out.println(card);
	        }
	    
	       
	        List<Integer> deckList = Arrays.asList(deck);
	       
	 // Shuffle the cards
	        Collections.shuffle(deckList,new Random());
	    
	        System.out.println("Enter the number of players to deal");

	       
	 //scan for the input from user
	        Scanner scan = new Scanner(System.in);

	        
	//check if input is of type integer than proceed otherwise display error
	        if(scan.hasNextInt()){

	            NO_OF_PLAYERS = scan.nextInt();
	            scan.close();


	            if(NO_OF_PLAYERS > 0 && NO_OF_PLAYERS <= 52){

	                String[] players = new String[NO_OF_PLAYERS];
	            
	                System.out.println("Cards after shuffle");
	                
	//deal card to each player in a round table fashion 
	               
	          
	                for (int i = 0; i < 52-(52%NO_OF_PLAYERS); i++) {
	                    String suit = suits[deckList.get(i) / 13];
	                    String rank = ranks[deckList.get(i) % 13];
	                    String card =  rank + " of " + suit;
	                    
	                    // Display the all the cards after shuffle
	                    System.out.println(card);
	                    
	                    if (players[curPlayer]!=null && players[curPlayer].length()>0){
	                        players[curPlayer]= players[curPlayer]+","+card;  
	                    }else {
	                        players[curPlayer]= card; 
	                    }
	                
	                    //check if current player is last player then restart from first
	                    if (curPlayer < NO_OF_PLAYERS-1){
	                        curPlayer++;
	                    }else {
	                        curPlayer = 0;
	                    }
	                }

	                //Display cards of each player
	                for (int i = 0; i < NO_OF_PLAYERS; i++) {
	                    System.out.println("Cards of player"+(i+1)+"\n"+players[i]+"\n\n");
	                }
	            }
	            return;
	        }
	        System.out.println("Wrong input! Number of players should be between 1 to 52\n");
	      }
	}


/* Output
 Cards before shuffle
Ace of Spades
2 of Spades
3 of Spades
4 of Spades
5 of Spades
6 of Spades
7 of Spades
8 of Spades
9 of Spades
10 of Spades
Jack of Spades
Queen of Spades
King of Spades
Ace of Hearts
2 of Hearts
3 of Hearts
4 of Hearts
5 of Hearts
6 of Hearts
7 of Hearts
8 of Hearts
9 of Hearts
10 of Hearts
Jack of Hearts
Queen of Hearts
King of Hearts
Ace of Diamonds
2 of Diamonds
3 of Diamonds
4 of Diamonds
5 of Diamonds
6 of Diamonds
7 of Diamonds
8 of Diamonds
9 of Diamonds
10 of Diamonds
Jack of Diamonds
Queen of Diamonds
King of Diamonds
Ace of Clubs
2 of Clubs
3 of Clubs
4 of Clubs
5 of Clubs
6 of Clubs
7 of Clubs
8 of Clubs
9 of Clubs
10 of Clubs
Jack of Clubs
Queen of Clubs
King of Clubs
Enter the number of players to deal
4
Cards after shuffle
8 of Spades
5 of Hearts
7 of Clubs
Queen of Hearts
King of Hearts
8 of Diamonds
7 of Hearts
3 of Diamonds
4 of Diamonds
6 of Spades
5 of Diamonds
King of Diamonds
King of Spades
Jack of Hearts
6 of Clubs
5 of Spades
3 of Hearts
6 of Hearts
2 of Diamonds
Queen of Spades
Ace of Spades
4 of Clubs
Ace of Hearts
10 of Hearts
9 of Clubs
Queen of Clubs
4 of Hearts
Queen of Diamonds
9 of Hearts
7 of Spades
5 of Clubs
8 of Clubs
Ace of Clubs
10 of Clubs
7 of Diamonds
Ace of Diamonds
10 of Spades
10 of Diamonds
6 of Diamonds
2 of Clubs
8 of Hearts
3 of Clubs
3 of Spades
2 of Hearts
Jack of Diamonds
Jack of Spades
4 of Spades
9 of Spades
2 of Spades
Jack of Clubs
9 of Diamonds
King of Clubs
Cards of player1
8 of Spades,King of Hearts,4 of Diamonds,King of Spades,3 of Hearts,Ace of Spades,9 of Clubs,9 of Hearts,Ace of Clubs,10 of Spades,8 of Hearts,Jack of Diamonds,2 of Spades


Cards of player2
5 of Hearts,8 of Diamonds,6 of Spades,Jack of Hearts,6 of Hearts,4 of Clubs,Queen of Clubs,7 of Spades,10 of Clubs,10 of Diamonds,3 of Clubs,Jack of Spades,Jack of Clubs


Cards of player3
7 of Clubs,7 of Hearts,5 of Diamonds,6 of Clubs,2 of Diamonds,Ace of Hearts,4 of Hearts,5 of Clubs,7 of Diamonds,6 of Diamonds,3 of Spades,4 of Spades,9 of Diamonds


Cards of player4
Queen of Hearts,3 of Diamonds,King of Diamonds,5 of Spades,Queen of Spades,10 of Hearts,Queen of Diamonds,8 of Clubs,Ace of Diamonds,2 of Clubs,2 of Hearts,9 of Spades,King of Clubs

*/
