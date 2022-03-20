package bank;

public class Main {

    public static void main(String[] args) {

        AccountsDatabase ad = new AccountsDatabase();
        ad.connect();

        Menu menu = new Menu();
        menu.accountMenuSwitch();
    }
}
