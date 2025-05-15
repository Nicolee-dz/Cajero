
package Modelo;
import java.util.ArrayList;

public class Customer {
    private String Name; 
    private String LastName;
    private int Age; 
    private int cc; 
    private ArrayList<Account> Accounts ; 

    public Customer(String Name, String LastName, int Age, int cc) {
        this.Name = Name;
        this.LastName = LastName;
        this.Age = Age;
        this.cc = cc;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public ArrayList<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(ArrayList<Account> Accounts) {
        this.Accounts = Accounts;
    }
    
    
}
