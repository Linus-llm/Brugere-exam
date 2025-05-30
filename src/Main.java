
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Jensssssewokfokf","qwer123","jensg@gmail.com","30504060");
        User user2 = new User("Torfqkwfpqkfqf","ewiof1123","traktor@gmail.com");
        User user3 = new User("Lisbethqwfqfqwfqwf","Lisbeth12345");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        users.add(user1);
        users.add(user2);
        users.add(user3);

        printInAlphabeticOrder(users);
    }
    public static void printInAlphabeticOrder(ArrayList<User> Users){
        ArrayList<String> usersNames = new ArrayList<>();
        for(User u:Users){
            String tmp = u.getName();
            usersNames.add(tmp);

        }
        Collections.sort(usersNames);
        for(String i: usersNames){
            System.out.println(i);
        }
    }
}
