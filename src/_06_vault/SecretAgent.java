package _06_vault;

public class SecretAgent {
    public void findCode(Vault vault) {
        for (int i = 0; i<1000000; i++){
            boolean code = vault.tryCode(i);
            if (code){
                System.out.println(i);
            }

        }
    }

}

