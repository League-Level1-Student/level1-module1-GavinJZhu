package _06_vault;

import java.util.Random;

/**
 * 
 * A vault with a secret code
 *
 */
public class Vault {
	private static int secret = new Random().nextInt(1000001);
	public static void main(String[] args) {
		Vault vault = new Vault();
		vault.tryCode(0);
		System.out.print(secret);
	}
	/**
	 * Tries to access the vault
	 * 
	 * @param guess the code being attempted
	 * @return true if the guess matches the code, false otherwise
	 */
	public boolean tryCode(int guess) {
		return guess == secret;
	}
}
