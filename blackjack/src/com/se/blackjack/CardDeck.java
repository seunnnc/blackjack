package com.se.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();

	
	public CardDeck() {
		init();
	}

	//String 배열에 값 넣어줌
	private void init() {
		for(int i = 0; i < Card.PATTERNS.length; i++) {		//카드의 패턴 
			for(int z = 1; z <= 13; z++) {		// 패턴에 카드 숫자 
				//arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				//int point = getPoint(deno);
				int point = getPoint(z);
				Card c = new Card(pattern, deno, point);
				arr.add(c);
			}
		}
	}
	
	/*
	private int getPoint(String deno) {
		switch(deno) {
		case "A" : return 1; 
		case "J": case "Q": case "K" : return 10;
		default: return Integer.parseInt(deno);
		}
	}
	*/
	
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}
	
	private String getDeno(int num) {
		switch(num) {
		case 1 : return "A";
		case 11 : return "J";
		case 12 : return "Q";
		case 13 : return "K";
		default: return String.valueOf(num);
		}
	}

	
	@Override
	public String toString() {
		/*
		for(Card c : arr) {
			System.out.println(c);
		}
		return "";
		*/
		String str = "";
		for(Card c : arr) {
			str += c + "\n";
		}
		return str;
		
	}
	
	/*
	public Card getCard() {
		int rIdx = (int)(Math.random() * arr.size());
		
		Card c = arr.get(rIdx);
		arr.remove(rIdx);
		return c;
		
	}
	*/
	
	public Card getCard() {
		int rIdx = (int)(Math.random() * arr.size());

		return arr.remove(rIdx);
		
	}


}

