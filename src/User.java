import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String name;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String name, String password) {
        if(name.length()<12||Character.isLowerCase(name.charAt(0))){
            System.out.println("kan ikke oprette user med færre end 12 karakterer og uden stort bogstav");
        }else {
            this.name = name;
            this.password = password;
        }
    }

    public User(String name, String password, String email) {
        if(name.length()<12||Character.isLowerCase(name.charAt(0))||!email.contains("@")){
            System.out.println("kan ikke oprette user med færre end 12 karakterer, uden stort bogstav og email uden @");
        }else {
            this.name = name;
            this.password = password;
            this.email = email;
        }
    }

    public User(String name, String password, String email, String phoneNumber) {
        if(name.length()<12||Character.isLowerCase(name.charAt(0))||!email.contains("@")){
            System.out.println("kan ikke oprette user med færre end 12 karakterer, uden stort bogstav og email uden @");
        }else {
            this.name = name;
            this.password = password;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    @Override
    public String toString() {
        ArrayList<String> attributesToBePrinted = new ArrayList<>();
        String resultString = "";
        attributesToBePrinted.add(this.name);
        attributesToBePrinted.add(this.password);
        attributesToBePrinted.add(this.email);
        attributesToBePrinted.add(this.phoneNumber);
        for (String i : attributesToBePrinted) {
            if (i != null) {
                resultString+=i+" ";

            }

        }
        return resultString;
    }

}
