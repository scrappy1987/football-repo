package com.qa.football;

import com.qa.football.team.Rangers;

public class App {

	public static void main(String[] args) {
		Rangers rangers = new Rangers("Best team ever");
		System.out.println("This is the message: " + rangers.getMessage() );
	}

}
