package jogo.ufpa;

import java.util.Random;


public class Dado {

	public int getFace() {
		Random rand = new Random();
		int face = 1+rand.nextInt(6);
		return face;
	}
}
