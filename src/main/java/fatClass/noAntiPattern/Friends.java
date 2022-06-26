package fatClass.noAntiPattern;

import java.util.ArrayList;
import java.util.List;

public class Friends {
    private List<User> listFriends = new ArrayList<>();

    public void addFriend(User friend){
        listFriends.add(friend);
    }

    public void showFriends(){
        System.out.println("<<< Showing list of friends >>>");
        for (User user : listFriends) {
            System.out.println("Username: " + user.getUsername());
        }
        System.out.println();
    }
}
