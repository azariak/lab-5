package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {

    private final String username;

    public String getUsername() {
        return username;
    }

    public LogoutInputData(String username) {
        // TODO: save the current username in an instance variable and add a getter. DONE
        this.username = username;
    }

}
