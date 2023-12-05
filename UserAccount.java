public class UserAccount {
    
    String username;
    String password;
    boolean isActive;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true; // set akun aktif saat pertama kali dibuat
    }

    public void activateAccount() {
        isActive = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun " + username + " telah dinonaktifkan.");
    }

    public boolean isActive() {
        return isActive;
    }

    // getter dan setter untuk atribut username dan password
    // ...

    public static void main(String[] args) {
        UserAccount user = new UserAccount("meita_sahara", "password558");
        System.out.println("Status akun: " + user.isActive());

        user.deactivateAccount();
        System.out.println("Status akun setelah dinonaktifkan: " + user.isActive());

        user.activateAccount();
        System.out.println("Status akun setelah diaktifkan: " + user.isActive());
    }
}