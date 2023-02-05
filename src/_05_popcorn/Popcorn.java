package _05_popcorn;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


/* Your mission and you have to accept it:
 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
 * The main method should create a bag of Popcorn and cook it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 * Don't change the existing methods.
 */
class PopcornMaker{
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what popcorn flavor do you want");
		Popcorn pc = new Popcorn(flavor);
		String cookLength = JOptionPane.showInputDialog("how long do you want me to cook it (say the number in minutes and don't put any letters)");
		
		Microwave mv = new Microwave();
		mv.putInMicrowave(pc);
		mv.setTime(Integer.parseInt(cookLength));
		mv.startMicrowave();
		pc.eat();
	}
}
class Microwave {
	private int cookTime;
	Popcorn thingToBeCooked;

	Microwave() {
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		this.cookTime = cookTimeInMinutes;
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
	}

	void startMicrowave() {
		if (thingToBeCooked == null) {
			System.out.println("Microwave says: there's nothing in the microwave!");
		} else {
			for (int i = 0; i < cookTime * 10 + 1; i++) {
				thingToBeCooked.applyHeat();
				if (i>70) {
					JOptionPane.showMessageDialog(null, "welp, the popcorn fully burned");
					break;
				}
			}
			thingToBeCooked.eat();
		}
	}
}

public class Popcorn {

	private int kernels = 20;
	private String flavor;
	private boolean isCooked = false;

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}

	public Popcorn() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		if (isCooked) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("Don't eat the popcorn. Not all the kernels have popped!");
		}
	}
	
	public void applyHeat() {
		pause();

		if (kernels == 0) {
			isCooked = true;
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


