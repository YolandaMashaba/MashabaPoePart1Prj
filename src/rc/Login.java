package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class Login {

    //Instance variables for full name, last name, username and password
    private String full_name;
    private String last_name;
    private String username;
    private String password;

    //Default constructors for each instance variable 
    public Login() {
        this.full_name = "";
        this.last_name = "";
        this.username = "";
        this.password = "";
    }

    //Accessor methods/ getters for each instance variable
    public String get_full_name() {
        return this.full_name;
    }

    public String get_last_name() {
        return this.last_name;
    }

    public String get_username() {
        return this.username;
    }

    public String get_password() {
        return this.password;
    }

    //Mutator methods/setters for each instance variable
    public void setfull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    //Create method to check username
    public boolean check_username() {
        boolean underscore = username.contains("_");
        if (username.length() <= 5 && underscore == true) {
          return true;
        } else {

            return false;
        }

    }

    //Method to check password complexity
    public boolean check_password_complexity() {
        if (password.length() >= 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[!@#$%^&*()-+?<>{}].*")) {
           return true;
        } else {
        }
        return false;

    }

    //Method to register user
    public String register_user() {
        String register_user = "";
        boolean check_username = this.check_username();
        boolean check_password_complexity = this.check_password_complexity();

        if (check_username && check_password_complexity) {
            register_user = "";
        } else {
            
        }
        return register_user;

    }

    public boolean login_user() {
        boolean login_user = false;
        if (get_username().equals(this.username) && get_password().equals(this.password)) {
            login_user = true;
        } else {
            
        }
        return false;
    }

}
