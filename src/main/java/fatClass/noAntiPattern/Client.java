package fatClass.noAntiPattern;

public class Client {
    public static void main(String[] args) {
        User andres = new User("andres123", "77763100", "Los Pinos calle 1 #44", true);

        User enrique = new User("enrique22", "66598321", "Irpavi calle 5 #16", false);

        andres.addFriend(enrique);
        andres.showProfile();
        andres.showFriends();

        enrique.showProfile();
        enrique.showFriends();

    }
}
