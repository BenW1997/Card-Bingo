
import java.util.ArrayList; 
import java.util.Random;

import java.util.Collections;
import java.util.List;
import java.io.Serializable;

public class crdBingo {



	//protoyype
	
	
	//shuffles
	 public static void shuffle (ArrayList stuff)
	    {
	        Collections.shuffle(stuff);
	        Collections.shuffle(stuff);
	    }
	 
		public static void main(String args[])
		{
			Deck dck=new Deck();
			Card crd =new Card();
		ArrayList <Integer> plyrPnt=new ArrayList<Integer>();
		// the next line adds 4 spots to keep track of points in the plyrPnt arraylist
		for (int s=0;s<5;s++)
		{
			plyrPnt.add(0);
		}
		ArrayList <Integer> dlrDck=new ArrayList<Integer>();
		ArrayList <Integer> plyDck=new ArrayList<Integer>();
	List ply1=new ArrayList();
	List  ply2=new ArrayList();
	List  ply3=new ArrayList();
	List  ply4=new ArrayList();
		
		
		
		dlrDck.addAll(dck.deckSend());
		plyDck.addAll(dck.deckSend());
		// gives the player their cards
		// the 20 is the number of total cards that the players all have in their hands added up aka total
		shuffle(plyDck);
		for (int i=0;i<20;i++)
		{
			if (i<5)
			{
			ply1.add(plyDck.get(i));	
			}
			else if (i<10)
			{
				ply2.add(plyDck.get(i));
			}
			else if (i<15)
			{
				ply3.add(plyDck.get(i));
			}
			else if (i<20)
			{
				ply4.add(plyDck.get(i));
			}
		}
		
		// this represents how we will draw  the top card  from the dealer  and puts it on the bottomof the deck after being drawn
		//and  how we will compare the cards to the dealer's deck
		int ply1ertst=0;
		 int ply2ertst=0;
		 int ply3ertst=0;
		 int ply4ertst=0;
		 
		shuffle(dlrDck);
		boolean winner=true;
		// this also represents the compare card thing
		for (int i=0; i<52;i++)
		{
			System.out.println(dlrDck.get(i));
		for (int a=0;a<5;a++)
			
		if (ply1.get(a).equals(dlrDck.get(i)))
				{
			ply1ertst	=ply1ertst+1;
				}
		else if (ply2.get(a).equals(dlrDck.get(i)))
		{
	ply2ertst	=ply2ertst+1;
		}
		else if (ply3.get(a).equals(dlrDck.get(i)))
		{
	ply3ertst	=ply3ertst+1;
		}
		else if (ply4.get(a).equals(dlrDck.get(i)))
		{
	ply4ertst	=ply4ertst+1;
		}
		
		// this part is checking for points after each chec
		
		if (ply1ertst==5)
		{
			System.out.println("player 1 wins");
			winner = true;
		}
		else if (ply2ertst==5)
		{
			System.out.println("player 2 wins");
			winner = true;
		}
		else if (ply3ertst==5)
		{
			System.out.println("player 3 wins");
			winner = true;
		}
		else if (ply4ertst==5)
		{
			System.out.println("player 4 wins");
			winner = true;
		}
		}
		
	

		// For the arraylist plyer point it stores the points for the players if their card equls the card the dealer drew
		
		}
		
	}


