package fatClass.noAntiPattern;

public class Profile {
    private User user;
    private boolean publicProfile;

    public Profile(User user, boolean publicProfile) {
        this.user = user;
        this.publicProfile = publicProfile;
    }

    public void showInfo(){
        System.out.println("<<< Showing profile information >>>");
        System.out.println("Public profile: " + publicProfile);
        System.out.println("Username: " + user.getUsername());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Cellphone number: " + user.getCellphone());
        System.out.println();
    }
}
