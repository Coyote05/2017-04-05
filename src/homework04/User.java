package homework04;

import java.util.Random;

public class User {
    private int id;
    private String username;
    private String password;

    Random random = new Random();
    PasswordGenerator passwordGenerator = new PasswordGenerator();

    public User(){
    }

    public User(String username){
        Random random = new Random();
        this.username = username;
        this.id = random.nextInt();
        this.password = passwordGenerator.generatePassword(8);
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
