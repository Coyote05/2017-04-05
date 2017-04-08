package homework04;

import java.util.Random;

public class PasswordGenerator {

    public String generatePassword(int lenght) {

        Random random = new Random();
        StringBuilder passwd = new StringBuilder();
        String options = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!%?";


        while (passwd.length() < lenght) {
            int i = (int) (random.nextFloat() * options.length());
            passwd.append(options.charAt(i));
        }
        String finalPassword = passwd.toString();
        return finalPassword;
    }
}
