package com.se.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	//저장하려면 전역변수에 
	private List<Card> arr = new LinkedList();

	public void receiveCard(Card card) {
		arr.add(card);
	}

	
	private String name = "gamer";
	
	public String getName() {
		return name;
	}

	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}

	public void openCards() {
		for(Card c : arr) {
			System.out.println(c);
		}
		System.out.printf(getName() +" 점수 : %d\n", getTotalPoint());

	}


	public void moreCards(CardDeck cd) {
		Scanner sc = new Scanner(System.in);


		while (true) {
			openCards();
			System.out.print("카드를 한 장 더 받으시겠습니까? : (Y/N)\n");

			String answer = sc.next();
			if(answer.equals("N")) {
				break;
			}else if(!(answer.equals("N")) && !(answer.equals("Y"))) {
				System.out.println("Y 또는 N만 입력하세요");
			} else {
				receiveCard(cd.getCard());
			}


		}

	}


}
