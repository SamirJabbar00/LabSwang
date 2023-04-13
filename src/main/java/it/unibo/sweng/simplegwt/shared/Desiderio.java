package it.unibo.sweng.simplegwt.shared;

public class Desiderio {
	    private Card card;
	    private int conditions;
	    private String desiredCardDescription;
	    private Utente userOfDesire;

	    public Desiderio (Card card, int conditions, String desiredCardDescription, Utente userOfDesire) {
	        this.card = card;
	        this.conditions = conditions;
	        this.desiredCardDescription = desiredCardDescription;
	        this.userOfDesire = userOfDesire;
	    }

	    // getters and setters
	    public Card getCard() {
	        return card;
	    }

	    public void setCard(Card card) {
	        this.card = card;
	    }

	    public int getConditions() {
	        return conditions;
	    }

	    public void setConditions(int conditions) {
	        this.conditions = conditions;
	    }

	    public String getDesiredCardDescription() {
	        return desiredCardDescription;
	    }

	    public void setDesiredCardDescription(String desiredCardDescription) {
	        this.desiredCardDescription = desiredCardDescription;
	    }

	    public Utente getUserOfDesire() {
	        return userOfDesire;
	    }

	    public void setUserOfDesire(Utente userOfDesire) {
	        this.userOfDesire = userOfDesire;
	    }
	

}
