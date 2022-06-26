package fatClass.antiPattern;

public class Client {
    public static void main(String[] args){
        User andres = new User("andres123", "72569800", "Los pinos calle 1 #44", true);
        User enrique = new User("enrique22", "66598321", "Irpavi calle 5 #16", false);

        andres.showProfile();
        andres.addFriend(enrique);
        andres.showFriends();

        enrique.showProfile();
        enrique.showFriends();
    }
}
