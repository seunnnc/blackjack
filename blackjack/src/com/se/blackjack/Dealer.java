package com.se.blackjack;

public class Dealer extends Gamer {

	private String name = "dealer";
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void moreCards(CardDeck cd) {
		// 딜러가 가지고 있는 카드의 합계 점수가 17점 이상이 될 떄까지 카드 뽑기
		//int totalPoint = getTotalPoint();
		
//		int stopPoint = 17;
		while (getTotalPoint() < 17) {
			
			receiveCard(cd.getCard());
			
		}

	}
	
	

}
