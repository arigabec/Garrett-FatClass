package fatClass.noAntiPattern;

public class User {
    private String username;
    private String cellphone;
    private String address;
    private Friends userFriends;
    private Profile userProfile;

    public User(String username, String cellphone, String address, boolean publicProfile) {
        this.username = username;
        this.cellphone = cellphone;
        this.address = address;
        userFriends = new Friends();
        userProfile = new Profile(this, publicProfile);
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

    public void addFriend(User friend){
        userFriends.addFriend(friend);
    }

    public void showFriends(){
        userFriends.showFriends();
    }

    public void showProfile(){
        userProfile.showInfo();
    }
}


