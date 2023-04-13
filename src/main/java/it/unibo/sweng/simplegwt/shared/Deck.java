package it.unibo.sweng.simplegwt.shared;
import java.util.List;
public class Deck {

	    private Utente userOwner;
	    private List<Card> cardList;
	    private int deckID;

	    public Deck(Utente userOwner, List<Card> cardList, int deckID) {
	        this.userOwner = userOwner;
	        this.cardList = cardList;
	        this.deckID = deckID;
	    }

	    // getters and setters
	    public Utente getUserProperty() {
	        return userOwner;
	    }

	    public void setUserOwner(Utente userOwner) {
	        this.userOwner = userOwner;
	    }

	    public List<Card> getCardList() {
	        return cardList;
	    }

	    public void setCardList(List<Card> cardList) {
	        this.cardList = cardList;
	    }

	    public int getDeckID() {
	        return deckID;
	    }

	    public void setDeckID(int deckID) {
	        this.deckID = deckID;
	    }
	
}
