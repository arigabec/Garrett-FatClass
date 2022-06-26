package fatClass.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String cellphone;
    private String address;
    private boolean publicProfile;

    private List<User> listFriends = new ArrayList<>();

    public User(String username, String cellphone, String address, boolean publicProfile) {
        this.username = username;
        this.cellphone = cellphone;
        this.address = address;
        this.publicProfile = publicProfile;
    }

    public String getUsername() {
        return username;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void showProfile(){
        System.out.println("<<< Showing profile information >>>");
        System.out.println("Public profile: " + publicProfile);
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
        System.out.println("Cellphone number: " + cellphone);
        System.out.println();
    }

    public void addFriend(User user){
        listFriends.add(user);
    }

    public void showFriends(){
        System.out.println("<<< Showing list of friends >>>");
        for (User user : listFriends) {
            System.out.println("Username: " + user.getUsername());
        }
        System.out.println();
    }
}
