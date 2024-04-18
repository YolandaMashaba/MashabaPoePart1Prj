package rc;


import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class MashabaIceTaskThree {

    static Login obj_login = new Login();
    static boolean registration = true;
    static boolean login = false;

    public static void main(String[] args) {
        boolean username = false;
        boolean password = false;

        while (registration) {
            get_user_input();
            if (obj_login.check_username()) {
                JOptionPane.showMessageDialog(null,"Username successfully captured");
                username = true;
            } else {
                JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length. ");
            }
            if (obj_login.check_password_complexity()) {
                JOptionPane.showMessageDialog(null,"Password successfully captured");
                password = true;
            } else {
                JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character. ");
            }
            if (username && password) {
                registration = false;
            } else {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
            }
        }

               

        //Method to register user
        register_user();

    }

    //Method to prompt the user for input
    public static void get_user_input() {
        obj_login.setfull_name(JOptionPane.showInputDialog("Enter full name: "));
        obj_login.setlast_name(JOptionPane.showInputDialog("Enter last name: "));
        obj_login.setusername(JOptionPane.showInputDialog("Enter username: "));
        obj_login.setpassword(JOptionPane.showInputDialog("Enter password: "));
    }

    public static void register_user() {
        String full_name = obj_login.get_full_name();
        String last_name = obj_login.get_last_name();
        JOptionPane.showMessageDialog(null, "Welcome " + full_name + " " + last_name + "," + " it is great to see you again.");
        obj_login.get_full_name();
        obj_login.get_last_name();
        obj_login.get_username();
        obj_login.get_password();

    }

}
