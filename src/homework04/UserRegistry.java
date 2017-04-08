package homework04;


import java.util.Scanner;

public class UserRegistry {

    private User[] users;

    public UserRegistry(){
        this.users = new User[10];
        users[0] = new User("Béla");
    }

    public void run(){
        int operation = -1;
        while(operation != 0){
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adja meg a műveletet(0-4): ");
            operation = scanner.nextInt();

            switch (operation){
                case 1:
                    printAllUser();
                    break;
                case 2:
                    addNewUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Nincs ilyen menüpont!");
            }
        }
    }

    private void printMenu(){

        System.out.println("**************************");
        System.out.println("***        Menu        ***");
        System.out.println("***   Get All User(1)  ***");
        System.out.println("***   Add new User(2)  ***");
        System.out.println("***   Update User(3)   ***");
        System.out.println("***   Delete User(4)   ***");
        System.out.println("***      Exit (0)      ***");
        System.out.println("**************************");
    }

    private void printAllUser(){
        for(int i = 0; i < users.length; ++i){
            if(users[i] !=null)
            System.out.println(users[i].toString());
        }
    }

    private void addNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a felhasználónevet!");
        String name = scanner.next();
        for(int i = 0; i < users.length; ++i){
            if(users[i] == null){
                users[i] = new User(name);
                break;
            }
        }
    }

    private void deleteUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a törölni kívánt ID-t!");
        int id = scanner.nextInt();
        for(int i = 0; i < users.length; ++i) {
            if (users[i] != null) {
                if (users[i].getId() == id) {
                    users[i] = null;
                }
            }
        }
    }

    private void updateUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az ID-t!");
        int id = scanner.nextInt();
        System.out.println("Adja meg az új felhasználónevet!");
        String newName = scanner.next();

        for(int i = 0; i < users.length; ++i){
            if (users[i].getId() == id){
                users[i] = new User(newName);
                break;
            }
            else{
                System.out.println("Nem találtam ilyen ID-vel rendelkező felhasználót!");
            }
        }
    }
}
