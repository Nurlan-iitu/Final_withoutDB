package com.company;

public class BetsCart {
    private String matchName;
    private String bet;

    public BetsCart() {
    }

    public BetsCart(String match, String bet) {
        this.matchName = match;
        this.bet = bet;
    }

    public String getMatch() {
        return matchName;
    }

    public void setMatch(String match) {
        this.matchName = matchName;
    }

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public String toString(){
        return matchName+ "\n"+bet+"\n";
    }
}
