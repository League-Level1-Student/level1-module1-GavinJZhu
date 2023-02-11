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
	 * @param key the code being attempted
	 * @return true if the key matches the code, false otherwise
	 */
	public boolean tryCode(int key) {
		return key == secret;
	}
}
