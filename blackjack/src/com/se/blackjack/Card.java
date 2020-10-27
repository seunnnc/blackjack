package com.se.blackjack;

public class Card {
	public final static String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private String pattern;
	private String denomination;
	private final int point;
	
	//생성자 - 클래스와 이름이 같고 returnX
	public Card (String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}

	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return String.format("p: %s, d: %s, p: %d", pattern, denomination, point);
	}
	
}
