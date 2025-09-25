import java.util.ArrayList;
import java.util.*;

public class BuddyInfo {
    //getter method

    private String firstName;
    private String lastName;
    private int age;

    public BuddyInfo(String firstName, String lastName, int age) {
        //these are constructors to instantiate the class
        this.firstName =  firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public BuddyInfo() {

        this("Unknown", "Unknown", 0);
    };

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }


    public static void main(String[] args) {
        BuddyInfo person1 = new BuddyInfo("Pardis", "Ehsani", 19);

        System.out.println("Hello " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

    }
}


