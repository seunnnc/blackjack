package com.se.blackjack;

public class Rule {
	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		int gamerPoint = gamer.getTotalPoint();
		int dealerPoint = dealer.getTotalPoint();

		int maxPoint = 21;

		if((gamerPoint >= maxPoint && dealerPoint >= maxPoint) || gamerPoint == dealerPoint) {
			System.out.println("비김");
		} else if(gamerPoint <= maxPoint && gamerPoint < dealerPoint || dealerPoint > maxPoint) {
			System.out.println("gamer 우승");
		} else {
			System.out.println("dealer 우승");
		}
	}
}
