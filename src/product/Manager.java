package product;

public class Manager {
    private  String login="Malika";
    private String password="2006";

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
